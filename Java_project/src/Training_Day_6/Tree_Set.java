package Training_Day_6;

import java.util.*;

public class Tree_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Set<String> set=new TreeSet<>();
		set.add("Bus");
		set.add("Car");
		set.add("Bike");
		set.add("Jeep");
		set.add("Car");
		set.add("Van");
		set.add("Cycle");
		//set.add(null);
		//set.add(null);
		set.add("Jeep");
		set.add("Auto");
		System.out.println(set);
		System.out.println(set.equals("House"));
		set.remove("Bus");
		System.out.println(set);
		
		Iterator<String> it= set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}

	}

}
