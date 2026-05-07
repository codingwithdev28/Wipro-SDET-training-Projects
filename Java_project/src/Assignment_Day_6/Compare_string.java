package Assignment_Day_6;

import java.util.Scanner;

public class Compare_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first String");
		String s1=sc.nextLine();
		System.out.println("Enter Second String");
		String s2=sc.nextLine();
		if(s1.equals(s2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}


	}

}
