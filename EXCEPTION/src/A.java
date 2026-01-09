
public class A {
  void a() {
	  //일반코
	  try {
		  //예외 대처 코딩
		  int a = 10 / 0;
	  } catch( ArithmeticException d) {
		  System.out.println("예외 상황 발생");
	  }	catch( Exception e) {
		  System.out.println("전체 예외 상황 발생");
	  }	
  }
}
