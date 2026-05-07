package Assignment_Day_1;

import java.util.Scanner;

public class check_v_c {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			System.out.println("It is a vowel");
		else
			System.out.println("It is a consonant");
			
		
	}


}
