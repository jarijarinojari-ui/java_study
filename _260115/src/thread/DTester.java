package thread;

public class DTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new D());
		System.out.println(t);
		t.start();
		
		new Thread(new D()).start();
	}

}
