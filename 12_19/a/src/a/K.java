package a;

public class K {
	// 결합, 의존성을 가진 코드는 별로 안좋은 코딩이다. 왜? 코드가 같이 꼬이니까
	J j= new J();
	int k = new J().j;
	int k2 = new J().J; 	// 좋지 않은 코드 님이 생성하지 않아도 생성 되어 있습니다.
	int k3 = J.J;			// 올바름
	/*J.j2()는 코드이므르로 안에서 불러야한다.*/
	
	
	{
		J j= new J();
	}
	K () {
		J j= new J();
		J.j2();  // 클래스 메소드는 안에서 불러야한다.
	}
	void k() {
		J j= new J();
		J.j2(); //클래스 
	}
}
