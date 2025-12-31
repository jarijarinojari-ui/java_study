package _1230.impl;

public interface A {
	int a = 10; // 클래스
	void a(); //추상 매소드
	default void a2() {};//디폴트라고 적으면 (구현 의무가 없다.)
	static void a3() {}//클래스 메소드
}
