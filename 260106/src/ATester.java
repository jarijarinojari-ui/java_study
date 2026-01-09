import java.security.Identity;

public class ATester {
	public static void main (String[] args) {
		t2();
	}
	
	static void t2() {
		A a= new A();
		Class c = a.getClass();
		System.out.println();
	}
	
	void t1() {
		A a = new A();
		System.out.println(a.hashCode());
		System.out.println(System.identityHashCode(a));
		A a2 = new A();
		System.out.println(a2.hashCode());
		boolean flag = a.equals(a2);
		System.out.println(flag);	
	}
	
	
}
