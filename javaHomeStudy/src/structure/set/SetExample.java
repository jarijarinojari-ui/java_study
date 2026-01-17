package structure.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("사과");
		set.add("바나나");
		set.add("사과");
		
		System.out.println("Set 크기: " + set.size());
		System.out.println(set);
	}
}
