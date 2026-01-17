package jenerick;

class NumberBox<T extends Number> {
	private T num;
	
	public void setNum(T num) {
		this.num = num;
	}
	
	public void printDouble() {
		System.out.println("Double : "+num.doubleValue());
	}
}

public class GeneNum {
	public static void main(String[] args) {
		NumberBox<Integer> intbox = new NumberBox<>();
		intbox.setNum(100);
		intbox.printDouble();
		
	}
}
