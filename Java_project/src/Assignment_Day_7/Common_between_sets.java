package Assignment_Day_7;

import java.util.*;

public class Common_between_sets {

	public static void main(String[] args) {
		
		Set<Integer> cm= new HashSet<>(Arrays.asList(5,10,15,20,25,30,35,40,45));
		Set<Integer> dm= new HashSet<>(Arrays.asList(20,24,30,45,50,10,70));
		Set<Integer> pm=new TreeSet<>();
		for(int num:cm) {
			if(dm.contains(num)) {
				pm.add(num);
			}
		}
		System.out.println("Intersection of both sets: "+pm);

	}

}
