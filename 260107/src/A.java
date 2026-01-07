import java.util.Arrays;

public class A {
	
	static void a() {
		int a = 10;
		String s = "Hello";// 리터럴 방식 String Pool 저장
		String s2 = "Hello";// String Pool에 있는 Hello를 가르키게 된다.
		String s3 = new String("Hello"); // 인스턴스 생성
		s = s + "World";
		System.out.println(s.length()); // s의 길이가 나온다.
		System.out.println(s.charAt(5));// 5번째의 문자가 나온다.
		if ('W' == s.charAt(5)) {
			System.out.println("6 = W");
		}
		
		System.out.println(s.substring(1));// 부분 문자열
		System.out.println(s.substring(2,4));
		System.out.println(s.indexOf('s'));//글자 위치를 찾는 메소드
		// 존재하지 않는경우 -1이 리턴된다.
		System.out.println(s.substring(s.indexOf('W'),s.indexOf('W')+2));
		System.out.println(s.lastIndexOf('l'));
		
		System.out.println();
		System.out.println(s.replace('W', 'S'));
		System.out.println(s);// 스트링은 불변
		s = s.replace('W', 'S');
		System.out.println(s);
		s = s.replaceAll("l", "z");
		System.out.println(s);
		
		//쪼개기
		s = "Hello,World";
		String[] arr = s.split("[,]");
		System.out.println(Arrays.toString(arr));
		
		//합치기 조인 join
		s = s.join("|",arr);
		System.out.println(s);
		
		System.out.println("");
		System.out.println(s.contains("|")); // "|"가 있냐
		System.out.println(s.startsWith("H"));// "H"로 시작을 하냐
		System.out.println(s.endsWith("d")); // "d"로 끝나냐
		
		System.out.println(s.toUpperCase());// 대문자로 만들기
		
	}
	public static void main (String[] args) {
		a();
		
	}
}
