package Assignment_Day_1;

import java.util.Scanner;

public class divisible2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();

	if(n%3==0 || n%7==0) {
		System.out.println("Yes Divisible");
	}
	else
		System.out.println("Not Divisible");

}


}
