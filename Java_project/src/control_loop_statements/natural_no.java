package control_loop_statements;

import java.util.Scanner;

public class natural_no {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int N=sc.nextInt();
		int n=N;
		int sum=0;
		while(N>0) {
			sum+=N;
			N--;
		}
		System.out.println("Sum of 1st "+n+" natural number is: "+sum);

		
	}
	


}
