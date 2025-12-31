package _1230.design.proxy.ext;

public class Bproxy extends A{ //원본 클래스 메모리상
	B b;
	void a() {
		//전처리
		b.a(); // 원본 메소드
		//후처리
	};
}
