package list;


import java.util.LinkedList;
import java.util.List;

public class B {
	
//		List<Fruit> list = new LinkedList<Fruit> ();//다형성을 사용
	List<Fruit> a(List<Fruit> list){
		// 리스트는 순서가있고 중복이 허용이 된다.
//		list.add(10);
//		list.add("Hello");
//		list.add(true);
		list.add(new Fruit());
//		list.add(true);
		list.add(new Fruit());
		
		//get하면 기본적으로 Object로 나온다. -> get할 시 캐스팅이 필요함.
		Fruit a = list.get(0);
		Fruit f = (Fruit)list.get(3);//제네릭 이므로 캐스팅이 필요없어짐
		
		list.remove(1);
		
		System.out.println();		
		// 어레이리스트의 단점 : 삭제되면 빈공간이 사라지고 전진한다.
		//linkedList 빈공간을 유지하고 연결된다.
		return list;
	}
}

