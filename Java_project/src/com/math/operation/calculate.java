package com.math.operation;

import java.util.Scanner;

public class calculate {
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
	    calculate c= new calculate();
	    System.out.println("Addition: "+c.add(a, b));
	    System.out.println("Subtraction: "+c.sub(a, b));

	}

}
