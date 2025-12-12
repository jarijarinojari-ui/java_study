
public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String s2 = new String("hello"); // 레퍼런스 스트링 타입 , 클래스를 선언하려면 이렇게 해야함.
		
		A k = new A(10);
		A k2 = new A(10,20);
		k.f = 10;
		
		System.out.println(k.f); // a 변수 불러오기
		k.a(3,6);// 호출한다. 메소드 void a() 실행
		
		k.a(3.14);
		
		A2 sas = new A2();
		sas.a2();
		
		A3 boo = new A3();
		boo.a3();
	
	
	
	}

}
