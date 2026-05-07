package Assignment_Day_1;

import java.util.Scanner;

public class divisible {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();

	if(n%5==0 && n%11==0) {
		System.out.println("Yes "+n+" is multiple of 5 and 11");
	}
	else
		System.out.println("No "+n+" is not multiple of 5 and 11");

}

}
