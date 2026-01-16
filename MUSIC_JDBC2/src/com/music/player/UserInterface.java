package com.music.player;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.music.jdbc.OracleConnection;

public class UserInterface {

	private Connection conn;
	private Scanner scanner;
	private MusicPlayer mp;
	
	public UserInterface() {
		conn = OracleConnection.getConnection();
		scanner = new Scanner(System.in);
		mp = new MusicPlayer(false);
	}
	
	public void start() {
		while (true) {
			System.out.println("============================");
			System.out.println("글로벌 뮤직타운에 오신것을 환영합니다.");
			System.out.println("1>뮤직 등록");
			System.out.println("2>뮤직 조회");
			System.out.println("3>뮤직 삭제");
			System.out.println("4>뮤직 수정");
			String menu = scanner.nextLine();
			if ("1".equals(menu)) {
				addMusic();
			}
			if ("2".equals(menu)) {
				showMusic();
			}
			if ("3".equals(menu)) {
				deleteMusic();
			}
			System.out.println();
		}
	}
	
	private void addMusic() {
		try {
			System.out.println("=====================");
			System.out.println("가수명?");
			String singer = scanner.nextLine();
			System.err.println("발매사?");
			String releaseComp = scanner.nextLine();
			System.out.println("발매일?");
			String releasDate = scanner.nextLine();
			conn = mp.addMusic(conn, releasDate, singer, releaseComp, releasDate);
			System.err.println("등록하시겠습니까(y/n)?");
			String insertYN = scanner.nextLine();
			if ("y".equals(insertYN) ) {
				conn.commit();
			} else {
				conn.rollback();
			}
			} catch (Exception e) {
				e.printStackTrace();
				try {conn.rollback();}catch(Exception e1 ) {e1.printStackTrace();}
			}
			
			
		}
	
	
	private void showMusic() {
		System.out.println("=================================");
		List<Music> musicList = mp.getMusicList(conn);
		for (int i = 0; i < musicList.size() ; i++) {
			Music music = musicList.get(i);
			System.out.printf(
					"[%s] %s (%s, %s, %s)"
					,music.getMusicNo()
					,music.getTitle()
					,music.getVocal()
					,music.getReleasComp()
					,music.getReleasDate()
					);
			System.out.println();
		}
	}
	
	private void deleteMusic() {
		//곡 번호 확인
		try {
		System.out.println("=================================");
		System.out.println("어떤 곡을 삭제하시겠습니까? (곡 번호 입력)");
		List<Music> musicList = mp.getMusicList(conn);
		for (int i = 0; i < musicList.size() ; i++) {
			Music music = musicList.get(i);
			System.out.printf(
					"[%s] %s (%s, %s, %s)"
					,music.getMusicNo()
					,music.getTitle()
					,music.getVocal()
					,music.getReleasComp()
					,music.getReleasDate()
					);
			System.out.println();
		}
		
		
		//번호 입력
		String sonNum = scanner.nextLine();
		conn = mp.deleteMusic(conn, sonNum);
		
		// 삭제 확인
		System.err.println("삭제하시겠습니까?(y/n)?");
		String insertYN = scanner.nextLine();
		
		if ("y".equals(insertYN) ) {
			conn.commit();
			
		} else {
			conn.rollback();
		}
		} catch (Exception e) {
			e.printStackTrace();
			try {conn.rollback();}catch(Exception e1 ) {e1.printStackTrace();}
		}
		
}}

