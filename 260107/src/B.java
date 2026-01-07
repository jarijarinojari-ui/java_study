
public class B {
	void b() {
		// StringBuffer 동기, 스레드안전.
		StringBuilder sb = new StringBuilder(); // 멀티 스레드 , 스레드 세이프
		sb.append("Hello");
		for ( int i = 1;  i <= 100 ; i++ ) {
			sb.append(i);
		}
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		new B().b();
		
	}
}
