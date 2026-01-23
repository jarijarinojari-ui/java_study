class A {
    int a = 10;
    int a(int a) {
        return this.a += a;
    }
}

class B extends A{
    int a = 20;
    int a(int a){
        return this.a += super.a +a;
    }
}

public class sdes {
    public static void aa() {
        B b = new B();
        A a = new B();
        a.a += a.a(5) + b.a(5);
        System.out.printf("%d",a.a);
    }
}