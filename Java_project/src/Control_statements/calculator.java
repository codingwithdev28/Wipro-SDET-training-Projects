package Control_statements;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st no");
		int a=sc.nextInt();
		System.out.println("Enter 2nd no");
		int b=sc.nextInt();
		System.out.println("Enter the operation you want to do:+,-,*,/");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		default:System.out.println("Enter valid operation");
		}

	}

}
