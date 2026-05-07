package Assignment_Day_6;

import java.util.Scanner;

public class check_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(Character.isDigit(ch)) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Not Digit");
		}

	}

}
