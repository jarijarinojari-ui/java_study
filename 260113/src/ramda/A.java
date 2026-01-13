package ramda;

public class A {
	I i = new I() {
		public void i() {
			System.out.println(11);
		}
	};
	void a() {
//		i.i();
//	}
	I i = () -> System.out.println(11);// 람다식
	}
}
