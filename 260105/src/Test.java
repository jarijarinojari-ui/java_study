
public class Test {
	void print(int x) {
		System.out.println("int " +x);
	}
	void print(double x) {
		System.out.println("double " +x);
	}
	public static void main (String args[]) {
		Test t = new Test();
		t.print(5D);
	}
}
