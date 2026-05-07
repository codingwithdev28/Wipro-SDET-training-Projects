package Assignment_Day_1;

import java.util.Scanner;

public class smallest3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		System.out.println("Enter 3rd number");
		int c=sc.nextInt();
		if(a<b) {
			if(a<c) 
				System.out.println("Smallest no "+a);
			
			else 
				System.out.println("Smallest no "+c);
			
		}
		else if(b<c)
			System.out.println("Smallest no "+b);
		else
			System.out.println("Smallest no "+c);
			
	}

}
