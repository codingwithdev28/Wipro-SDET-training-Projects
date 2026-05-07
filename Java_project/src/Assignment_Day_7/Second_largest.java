package Assignment_Day_7;

import java.util.*;

public class Second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> list= new ArrayList<>();
		System.out.println("Enter number of elements in the list");
		int n= sc.nextInt();
		
		System.out.println("Enter the elements in the list");
		
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
			
		}
		
		int l=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		
		for(int num:list) {
			if(num>l) {
				sl=l;
				l=num;
			}
			else if(num>sl && num!=l) {
				sl=num;
			}
			
		}
		System.out.println("Second Largest element: "+sl);
		

	}

}
