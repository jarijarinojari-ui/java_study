
public class ETester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new E();
		E e = (E)c; // 명시 캐스팅
		D d = (D)c;
		System.out.println(d.c);
	}

}
