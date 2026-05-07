package Assignment_day_3;

import java.util.*;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the array");
		int[] A=new int[n];
		for(int i=0;i<n;i++) {
			A[i] =sc.nextInt();
		}
		Set<Integer> set=new HashSet<>();
		
		
		for(int i=0;i<n;i++) {
			set.add(A[i]);
		

	}
		System.out.println(set);
	}

}
