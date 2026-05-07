package Training_Day_6;
import java.util.*;

public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list2= new LinkedList<Integer>();
		//ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(60);
		list2.add(null);
		list2.add(2,45);
		list2.add(60);
		list2.add(6);
		System.out.println(list2);
		System.out.println(list2.indexOf(null));
		System.out.println(list2.contains(8));
		System.out.println(list2.isEmpty());
		System.out.println(list2);
		System.out.println(list2.lastIndexOf(60));
		System.out.println(list2.add(9));
		System.out.println(list2);
		
		System.out.println(list2.remove(1));
		System.out.println(list2);
		
		System.out.println(list2.remove((Integer)60));
		System.out.println(list2);
		
		System.out.println(list2.get(3));
		System.out.println(list2.getFirst());
		System.out.println(list2.getLast());
		
		list2.set(3, 10);
		System.out.println(list2);
		System.out.println(list2.reversed());

	}

}
