package Training_Day_6;

import java.util.*;
public class Priority_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new PriorityQueue<String>();
		q.add("Jammu");
		q.add("Goa");
		q.add("Amritsar");
		q.add("Bhopal");
		q.add("Patna");
		q.add("Chennai");
		q.add("Banglore");
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.remove("Mumbai");
		q.remove("Chennai");
		System.out.println(q);
		
		System.out.println(q.offer("Pune"));
		System.out.println(q.offer("Kerala"));
		q.add("Mumbai");
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		
		
		

	}

}
