package generik;

public class Zoo<T extends Animal> {
	T[] zooArr;
	T t;
	void setT(T t){
		this.t = t;
	}
	T getT() {
		return this.t;
	}
}
