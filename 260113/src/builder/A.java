package builder;

public class A {
	int a;
	A(Builder b){
		this.a = b.a;
	}
 public static class Builder {
	 int a;
	 int a2;
	 
	 public Builder a(int a) {
		 this.a = a;
		 return this;
	 }
	 public Builder a2(int a) {
		 this.a2 = a;
		 return this;
	 }
	 public A build() {
		 return new A(this);
	 }
 }
}
