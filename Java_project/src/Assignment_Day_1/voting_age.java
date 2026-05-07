package Assignment_Day_1;

import java.util.Scanner;

public class voting_age {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>=18) {
			 
				System.out.println("Eligible for Voting");
			
		}
		else
			System.out.println("Not eligible for Voting");
			
	}
}


