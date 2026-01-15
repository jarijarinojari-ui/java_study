package thread;

public class Tester {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a);
		a.start();
		
		B b = new B();
		System.out.println(b);
		b.start();
	}

}
