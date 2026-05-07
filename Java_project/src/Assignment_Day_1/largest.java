package Assignment_Day_1;

import java.util.Scanner;

public class largest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		if(a>b) {
			 
				System.out.println("Largest no "+a);
			
		}
		else
			System.out.println("Largest no "+b);
			
	}
}
