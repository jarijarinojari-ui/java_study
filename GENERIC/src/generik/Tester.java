package generik;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo<Animal>[] z = new Zoo[3];
		z[0].setT(new Tiger());
		z[1].setT(new Tiger());
		z[2].setT(new Tiger());
		
		Animal[] arr = new Animal[3];
		arr[0] = z[0].getT();
		arr[1] = z[1].getT();
		arr[2] = z[2].getT();
		
	}

}
