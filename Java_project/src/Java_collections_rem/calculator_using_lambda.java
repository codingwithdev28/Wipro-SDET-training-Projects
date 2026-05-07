package Java_collections_rem;

import java.util.Scanner;

interface calculate{
	int operations(int a, int b);
}

public class calculator_using_lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		calculate add=(a,b) -> a+b;
		calculate sub=(a,b) -> a-b;
		calculate mul=(a,b) -> a*b;
		calculate div=(a,b) -> a/b;
		System.out.println("Enter 1st number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		
		System.out.println(a+" + "+b+" = "+add.operations(a,b));
		System.out.println(a+" - "+b+" = "+sub.operations(a,b));
		System.out.println(a+" * "+b+" = "+mul.operations(a,b));
		System.out.println(a+" / "+b+" = "+div.operations(a,b));
		
		

	}

}
