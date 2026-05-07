package Assignment_Day_8;

import java.util.*;

public class Online_shopping_cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> m=new HashMap<>();
		m.put("Phone", 40000);
		m.put("Watch", 5000);
		m.put("Laptop", 65000);
		m.put("Shoes", 7000);
		
		
		List<String> list = new ArrayList<>();
		list.add("Phone");
		list.add("Shoes");
		list.add("Watch");
		list.add("Shoes");
		
		
		System.out.println("You have added following items in your cart:");
		System.out.println(list);
		
		int bill=0;
		for(String x:list) {
			bill+=m.get(x);
		}
		
		System.out.println("\n Your Toatal Bill: "+bill);
		
		
		

	}

}
