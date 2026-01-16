package com.music.player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MusicPlayer {
	
	private List<Music> musicList;
	
	public MusicPlayer(boolean change) {
		// TODO Auto-generated constructor stub
		if (change) {
			musicList = new LinkedList<Music>();
		} else {
			musicList = new ArrayList<Music>();
		}
	}
	
	public void removerMusic(int idx) {
		musicList.remove(idx-1);
	}
	
	public Connection addMusic(
			Connection conn
			,String vocal
			,String title
			,String releasComp
			,String releasDate) throws Exception {
		conn.setAutoCommit(false);
		StringBuffer sb = new StringBuffer();
		sb.append(" INSERT INTO MUSIC (MUSIC_NO, TITLE, VOCAL) ");
		sb.append(" VALUES (SEQ_MUSIC.NEXTVAL, ?, ?) ");
		PreparedStatement stmt = conn.prepareStatement(sb.toString());
		stmt.setObject(1, title);
		stmt.setObject(2, vocal);
		stmt.executeUpdate();
		sb = new StringBuffer();
		sb.append(" INSERT INTO MUSIC_DETAIL (MUSIC_DETAIL_NO, RELEASE_COMP, RELEASE_DATE, MUSIC_NO) ");
		sb.append(" VALUES (SEQ_MUSIC_DETAIL.NEXTVAL, ?, ?, SEQ_MUSIC.CURRVAL)");
		stmt = conn.prepareStatement(sb.toString());
		stmt.setObject(1, releasComp);
		stmt.setObject(2, releasDate);
		stmt.executeUpdate();
		return conn;
	}
	
	public List<Music> getMusicList(Connection conn) {
		try {
		Statement stmt = conn.createStatement();
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT M.MUSIC_NO ");
		sb.append("       ,M.TITLE ");
		sb.append("       ,M.VOCAL ");
		sb.append("       ,D.RELEASE_COMP ");
		sb.append("       ,TO_CHAR(D.RELEASE_DATE, 'YYYY/MM/DD') AS RELEASE_DATE ");
		sb.append(" FROM MUSIC M ");
		sb.append(" INNER JOIN MUSIC_DETAIL D ");
		sb.append(" ON M.MUSIC_NO = D.MUSIC_NO ");
		sb.append(" ORDER BY D.RELEASE_DATE DESC ");
		// RsultSet
		ResultSet rs = stmt.executeQuery(sb.toString());
		musicList.clear();
		while (rs.next()) {
			Music music = new Music();
			music.setMusicNo(rs.getString("MUSIC_NO"));
			music.setVocal(rs.getString("VOCAL"));
			music.setTitle(rs.getString("TITLE"));
			music.setReleasComp(rs.getString("RELEASE_COMP"));
			music.setReleasDate(rs.getString("RELEASE_DATE"));
			musicList.add(music);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return musicList;
	}
	
	//음악 기본정보 삭제
	public Connection deleteMusic(Connection conn, String musicNum) throws Exception {
	    
	    conn.setAutoCommit(false); // 트랜잭션 시작
	    PreparedStatement stmt = null;

	    // -------------------------------------------------------
	    // 1단계: 자식 테이블 (MUSIC_DETAIL) 먼저 삭제
	    // -------------------------------------------------------
	    StringBuffer sbDetail = new StringBuffer();
	    sbDetail.append(" DELETE FROM MUSIC_DETAIL ");
	    sbDetail.append(" WHERE MUSIC_NO = ? ");

	    stmt = conn.prepareStatement(sbDetail.toString());
	    stmt.setObject(1, musicNum);
	    int detailResult = stmt.executeUpdate(); // 실행! (영향받은 행 개수 반환)
	    stmt.close(); // 사용한 Statement 닫기

	    System.out.println("상세 정보 삭제 건수: " + detailResult);


	    // -------------------------------------------------------
	    // 2단계: 부모 테이블 (MUSIC) 나중에 삭제
	    // -------------------------------------------------------
	    StringBuffer sbMusic = new StringBuffer();
	    sbMusic.append(" DELETE FROM MUSIC ");
	    sbMusic.append(" WHERE MUSIC_NO = ? ");

	    stmt = conn.prepareStatement(sbMusic.toString());
	    stmt.setObject(1, musicNum);
	    int musicResult = stmt.executeUpdate(); // 실행!
	    stmt.close();

	    System.out.println("기본 정보 삭제 건수: " + musicResult);

	    // 호출한 곳(UserInterface)에서 commit() 할 수 있도록 conn 반환
	    return conn; 
	}
}


