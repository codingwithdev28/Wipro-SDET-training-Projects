package Control_statements;

import java.util.Scanner;

public class even_odd {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		if(no%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
			
	}

}
