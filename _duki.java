package dd;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _duki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		int[] mondainum = new int[12];
		
		String[] kannzi = 
			{"睦月","如月","弥生","卯月",
					"皐月","水無月","文月","葉月",
						"長月","神無月","霜月","師走"};
		String[] yomikata = 
			{"むつき","きさらぎ","やよい","うづき",
					"さつき","みなづき","ふみつき","はづき",
						"ながつき","かんなづき","しもつき","しわす"};
		// 문제 순서 정하기 문제 없음
		for (int i = 0 ; i < mondainum.length ; i++ ) {
			mondainum[i] = rand.nextInt(mondainum.length)+1;
			
			// 중복방지
			for (int k = 0 ; k < i ; k++) {
				if(mondainum[i] == mondainum[k]) {
					i -= 1;
					
				}
			}
		}
		
		//
		for (int i = 0; i < mondainum.length; i++) {
			System.out.println(kannzi[mondainum[i]-1]+"는 몇 달 일까요?");
			
			int num = sc.nextInt();
			sc.nextLine();
			if (num != mondainum[i] ) {
				System.out.println("정답은 "+mondainum[i]);
				break;
			}
			
			System.out.println(kannzi[mondainum[i]-1]+"의 요미카타는?");
			
			String text = sc.nextLine();
			if ( ! text.equals(yomikata[mondainum[i]-1])  ) {
				System.out.println("정답은 "+yomikata[mondainum[i]-1]);
				break;
			}
		
		}
		
		
		
		
	}

}
