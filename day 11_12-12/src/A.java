
public class A {
	// 정보
	
	//생성자
	int f;
	A(int a){
		this.f = a;
	}
	// new 생성자 오버로딩
	A(int a, int a2){
		this.f = a + a2;
	}
	
	// 처리
	void a(int f) { // 처리 = 메소드
		// 코딩

		f += 1;
		System.out.println(f);

	}

	void a(int f, int dd) {

		f += 1;
		System.out.println(f);
		System.out.println(dd);
	}

	void a(double i) {

		System.out.println(i);

	}
}

class A2 {

	void a2() {
		System.out.println("4400");
	}

}

class A3 {
	void a3() {
		System.out.println("500");
	}
}
