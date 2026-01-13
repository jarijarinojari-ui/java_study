package stream;

public class A {
	static int a = 10;
	void a() {
		int a2 = 11;
		class A2 {
			void a2() {
				
				System.out.println(a2);
			}
		}
		
		new A2().a2();
	}
}
