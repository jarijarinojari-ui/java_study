
public class A {
	void a() {
		String s = "10";
		Integer a2 = Integer.valueOf(s);
		System.out.println(a2);
		int a = a2;
		
		s = String.valueOf(a);
		
		
	}
	static void a2() {
		Integer a = 100;
		Integer b = 200;
		int result = a.compareTo(b);
		System.out.println(result);
	}

}
