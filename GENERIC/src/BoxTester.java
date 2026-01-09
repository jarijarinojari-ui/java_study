
public class BoxTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Apple> box3 = new Box<Apple>;
		box3.setT(new Apple());
		
		
		Box box = new Box();
		box.setApple(new Apple());
		Apple apple = box.getApple();
		
		Box box2 = new Box();
		box2.setObject(new Apple());
		Apple apple2 = (Apple)box2.getObject();
		
	}

}
