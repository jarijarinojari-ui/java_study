package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;


public class A {
	Set<Fruit> set = new TreeSet<Fruit>();
	void a() {

		Fruit f1 = new Fruit("사과");
		System.out.println(f1.hashCode());
		set.add(f1);
		Fruit f2 = new Fruit("배");
		System.out.println(f2.hashCode());
		set.add(f2);
		Fruit f3 = new Fruit("감");
		System.out.println(f3.hashCode());
		set.add(f3);
		
		set.forEach(System.out::println);//람다식
		set.forEach(item);//람다식
		
		Iterator<Fruit> ite = set.iterator();
		while (ite.hasNext()) {
			Fruit f = ite.next();
//			ite.remove();
		}
		System.out.println();
		
	}
}
