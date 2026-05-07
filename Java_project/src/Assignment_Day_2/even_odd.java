package Assignment_Day_2;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		switch(n%2)
		{
		case 0:System.out.println("Even");
		break;
		case 1:System.out.println("Odd");
		break;
		default:System.out.println("Invalid number");
		}

	}

}
