package ramda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new B().b(new A().a());
		Predicate<Integer> P = x -> x > 8;
		System.out.println(P.test(5));
		
		Function<String, Integer> f = s -> s.length();
		Function<String, Integer> f2 = String::length;
		System.out.println(f.apply("Hello"));
		
		Consumer<String> printer = s -> System.out.println(s);
		printer.accept("Hello World");
		
		
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println(randomValue.get());
		System.out.println(randomValue.get());
		System.out.println(randomValue.get());
	}

}
