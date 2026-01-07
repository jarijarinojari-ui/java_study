
public class Box<T> {
	private T t;
	void setT(T t) {//setter 메소드
		this.t = t;
	}
	T getT() {//getter 메소드
		return this.t;
	}
	
	private Apple apple;
	private Object obj;
	void setApple(Apple apple) {
		this.apple = apple;
	}
	void setObject(Object obj) {
		this.obj = obj;
	}
	
	Apple getApple() {
		return this.apple;
	}
	Object getObject() {
		return this.obj;
	}
}
