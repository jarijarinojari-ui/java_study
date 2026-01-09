
public interface IA {
	int A = 10; //static final 이 생략되어 있다.
	void a();
	default void a2() {}
	static void a3() {}
}
