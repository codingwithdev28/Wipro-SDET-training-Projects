package Assignment_Day_1;

import java.util.Scanner;

public class pos_neg {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("It's a negative number");
		}
		else if(n>0){
			System.out.println("It's a positive number");
		}
		else{
			System.out.println("You have entered zero or invalid number");
		}
	}
}
