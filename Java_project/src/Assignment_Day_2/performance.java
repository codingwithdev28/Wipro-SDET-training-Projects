package Assignment_Day_2;

import java.util.Scanner;

public class performance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your grade");
		int ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'A':System.out.println("Distinct");
		break;
		case 'B':System.out.println("Excellent");
		break;
		case 'C':System.out.println("Good");
		break;
		case 'D':System.out.println("Average");
		break;
		case 'F':System.out.println("Fail");
		break;
		default:System.out.println("Enter a valid grade");
		}
		

	}

}
