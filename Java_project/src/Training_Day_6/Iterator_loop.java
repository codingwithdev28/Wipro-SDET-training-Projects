package Training_Day_6;

import java.util.*;

public class Iterator_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list2=new ArrayList<>();
		list2.add(60);
		list2.add(null);
		list2.add(2,45);
		list2.add(60);
		list2.add(6);
		System.out.println(list2);
		Iterator<Integer> it=list2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
