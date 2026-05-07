package com.math.operation;

import java.util.Scanner;

interface divide{
	void division(int a,int b);
	
}

class calculation implements divide{
	public void division(int a, int b) {
	try {
		int c=a/b;
		System.out.println("Result: "+c);
	}
	catch(ArithmeticException e) {
		System.out.println("Cannot Divide by Zero");
	}
	}
}
public class Exception_handling_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the dividend");
		int a=sc.nextInt();
		System.out.println("Enter the divisor");
		int b=sc.nextInt();
		
		calculation c= new calculation();
		
		c.division(a, b);
		

	}

}
