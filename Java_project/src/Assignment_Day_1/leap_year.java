package Assignment_Day_1;

import java.util.Scanner;

public class leap_year {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int y=sc.nextInt();
		if(y%4==0 && y%100!=0) {
	
				System.out.println("Leap year ");
			
		}
		else if(y%400==0)
			System.out.println("Leap year");
		else
			System.out.println("Not Leap year ");
			
	}

}
