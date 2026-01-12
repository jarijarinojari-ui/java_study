package set;

import java.util.Objects;

public class Fruit implements Comparable<Fruit>{
	String name;
	public Fruit(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(this.name);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.name == ((Fruit)obj).name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
	@Override
	public int compareTo(Fruit f) {
		// TODO Auto-generated method stub
		return f.name.compareTo(this.name);
	}
}
