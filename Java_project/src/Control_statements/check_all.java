package Control_statements;

import java.util.Scanner;

public class check_all {
	
	void check_decision_making(int a) {
		if (a>10) 
			System.out.println("True");
		else
			System.out.println("False");
		
	}
	void check_vowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println("It is a vowel");
		else
			System.out.println("It is a consonant");
			
	}
	void blood_donation(int age, int weight) {
		if (age>=18 & weight<45) {
			System.out.println("Can Donate Blood");
			
		}
		else
			System.out.println("Cannot Donate Blood");
	}
	void days(String day) {
		if(day=="Monday"||day=="Tuesday"||day=="Wednesday"||day=="Thursday"||day=="Friday")
			System.out.println("Working days");
		else if(day=="Saturday"||day=="Sunday")
			System.out.println("Week Off");
		else
			System.out.println("Invalid day Format");
			
	}
	void grade(float per) {
		if(per>=75 && per<100) {
			System.out.println("Dist");
			if(per>=85) {
				System.out.println("A+");
				if(per>=95) {
					System.out.println("A++");
				}
			}
			
		}
		else if(per>=60 && per<75) {
			System.out.println("First class");
		}
		else if(per>=50 && per<60) {
			System.out.println("Second class");
		}
		else if(per>=40 &&per<50) {
			System.out.println("pass class");
		}
		else if(per<40 && per>0) {
			System.out.println("pass class");
		}
		else if(per<=0 || per>=100) {
			System.out.println("Inavlid");
		}
		else {
			System.out.println("Enter valid numbers");
		}
		
	}
	
	
	public static void main(String[] args) {
		check_all A= new check_all();
		System.out.println("Enter the day in this format:"
				            + " Only 1st letter should be capital");
		Scanner sc=new Scanner(System.in);
		String d=sc.next().intern();
		
		A.days(d);
		
		
		float p=87f;
		A.grade(p);
		
	}

}
