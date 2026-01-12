package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class A {
	List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
	void a() {
		HashMap<String, Object> map1 = new HashMap<String, Object>();
		map1.put("name", "hong");
		map1.put("age", 21);
		map1.put("phone", "01012345678");
		list.add(map1);
		
		HashMap<String, Object> map2 = new HashMap<String, Object>();
		map2.put("name", "hong");
		map2.put("age", 21);
		map2.put("phone", "01012345678");
		list.add(map2);
		
		Iterator<HashMap<String, Object>> ite =  list.iterator();
		while (ite.hasNext()) {
			HashMap<String, Object> map = ite.next();
		}
		
		Iterator<HashMap<String, Object>> ite2 =  list.iterator();
		while (ite2.hasNext()) {
			HashMap<String, Object> map = ite2.next();
			Set<String> key = map.keySet(); // 키값 가져오는 메소드
			System.out.println();
		}
		
		
		
	}
}
