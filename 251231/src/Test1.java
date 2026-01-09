
public class Test1 {
	public class Test01 {
		// 다음과 같은 모양으로 출력되게 코드를 작성하세요.
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		// 4 5 6 7 8 9 10 1 2 3
		// 5 6 7 8 9 10 1 2 3 4
		// 6 7 8 9 10 1 2 3 4 5
		// 7 8 9 10 1 2 3 4 5 6
		// 8 9 10 1 2 3 4 5 6 7
		// 9 10 1 2 3 4 5 6 7 8
		// 10 1 2 3 4 5 6 7 8 9

		}
	static public void main (String args[]) {
		
		for ( int i = 1 ; i <= 10; i++ ) {
			for ( int j = i ; j <= 10 ; j++) {
				
			
				System.out.print(j);
				if (j -1 <= 1) {
					for (int k = i ; k >= 10 ; k++) {
						System.out.print(k+ "0");
					}
					
				}
			}
			System.out.println();
		}
		
	}

}
