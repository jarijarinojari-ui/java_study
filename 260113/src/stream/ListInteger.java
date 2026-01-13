package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ListInteger {
	static public void main(String[] args) {
		
		List<Integer> list = Arrays.asList(-1, 0, -7, 1, 2, 3, -3, 4, 5, 6);
		
		List<Integer> list2 = list.stream()
				.filter(x -> x > 0)// 중간연산
				.map(x -> x * 2)// 중간연산
				.collect(Collectors.toList()); // 마지막 연산
	}
}
