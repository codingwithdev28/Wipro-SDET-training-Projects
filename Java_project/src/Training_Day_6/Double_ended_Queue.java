package Training_Day_6;

import java.util.*;
public class Double_ended_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> d=new ArrayDeque<String>();
		d.add("Jammu");
		d.add("Goa");
		d.add("Amritsar");
		d.add("Bhopal");
		d.add("Patna");
		d.add("Chennai");
		d.add("Banglore");
		System.out.println(d);
		d.remove();
		System.out.println(d);
		d.remove("Mumbai");
		d.remove("Chennai");
		System.out.println(d);
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		System.out.println(d.offer("Surat"));
		System.out.println(d);
		

	}

}
