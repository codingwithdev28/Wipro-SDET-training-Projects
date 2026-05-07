package Control_statements;

import java.util.Scanner;

public class check_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your size");
		int size=sc.nextInt();
		switch(size)
		{
		case 26:System.out.println("Extra small");
		break;
		case 28:System.out.println("Small");
		break;
		case 30:System.out.println("Medium");
		break;
		case 32:System.out.println("Large");
		break;
		case 34:System.out.println("Extra Large");
		break;
		case 36:System.out.println("Extra Extra Large");
		break;
		default:System.out.println("Your size is either too small"
				+ " or too large");
		}
		
		}

	}


