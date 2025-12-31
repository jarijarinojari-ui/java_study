package _1230.design;
/**
 * Design Patton, Singleton, Factory, Proxy
 * 
 */

public class Singleton { // 인스턴스가 하나만 존재해야 한다
	private static Singleton ISTANCE = new Singleton();
	private Singleton() {}
	public static Singleton getInstance () {
		return ISTANCE;
	}
	public void a() {}
}
