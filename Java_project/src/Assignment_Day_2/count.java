package Assignment_Day_2;

import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int N=sc.nextInt();
		int c=0;
		while(N>0) {
			N/=10;
			c++;
		}
		System.out.println("Total no of digits is: "+c);
		


	}

}
