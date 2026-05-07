package Assignment_Day_2;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int N=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(N+" * "+i+" = "+(N*i));
			i++;
		}
		


	}

}
