package Java_collections_rem;

import java.util.*;

public class HASH_MAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map= new HashMap<>();
		
		map.put("One", 1);
		map.put("Ten", 4);
		map.put("Nine", 9);
		map.put("Five", 2);
		map.put("Three", 3);
		System.out.println(map);
		map.put("Other", 10);
		map.put(null, null);
		map.put(null, 6);
		map.put("Seven", 2);
		System.out.println(map);
		System.out.println(map.containsKey("nine"));
		System.out.println(map.containsValue(2));
		map.replace("Other",10,11);
		map.replace("Nine", 0);
		map.remove("Nine");
		System.out.println(map);
		System.out.println(map.get("Nine"));
		System.out.println(map.size());
		

	}

}
