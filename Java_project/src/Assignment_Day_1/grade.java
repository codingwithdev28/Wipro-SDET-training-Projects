package Assignment_Day_1;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks percentage");
		int per=sc.nextInt();
		if(per>=90 && per<100) {
			System.out.println("A+");	
		}
		else if(per>=80 && per<90) {
			System.out.println("A");
		}
		else if(per>=70 && per<80) {
			System.out.println("B");
		}
		else if(per>=60 &&per<70) {
			System.out.println("C");
		}
		else if(per>=40 && per<60) {
			System.out.println("D");
		}
		else if(per<40) {
			System.out.println("F");
		}
		else {
			System.out.println("Enter valid marks");
		}

	}

}
