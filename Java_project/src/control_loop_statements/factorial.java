package control_loop_statements;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int N=sc.nextInt();
		int n=N;
		int fac=1;
		while(N>0) {
			fac*=N;
			N--;
		}
		System.out.println("Factorial of "+n+" is: "+fac);

		

	}

}
