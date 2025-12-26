
public class B_Proxy extends A {
	// a의 기능을 개편하기 위해 만든 가짜 자식
	// b의 프록시
	B b;
	void a() {
		//코드 추가 : 전처리
		b.a();
		//코드 추가 : 후처리
		
	}
}
