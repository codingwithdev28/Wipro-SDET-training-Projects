package Assignment_Day_6;

import java.util.Scanner;

public class Integer_parameter {
	
	static int method(int x) {
		x= 56;
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		
		System.out.println("Number before method call: "+x);
		
		method(x);
		
		System.out.println("Number After method call: "+x);
		

	}

}
