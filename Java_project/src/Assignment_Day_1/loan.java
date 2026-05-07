package Assignment_Day_1;

import java.util.Scanner;

public class loan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your salary");
		int salary=sc.nextInt();

	if(age>18 && salary>=25000) {
		System.out.println("Yes Eligible for Loan");
	}
	else
		System.out.println("Not Eligible for Loan");

}
	}


