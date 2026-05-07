package Assignment_Day_8;

import java.util.HashMap;
import java.util.Scanner;


public class Non_repeating_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a string");
		String s= sc.next();
		
		
		HashMap<Character, Integer> m= new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			char ch= s.charAt(i);
			m.put(ch, m.getOrDefault(ch, 0)+1);
		}
		
		for(int i=0;i<s.length();i++) {
			char ch= s.charAt(i);
			if(m.get(ch)==1) {
			System.out.println("1st non-repeating character in this string: "+ch);
			return;
		}
		}
		
		System.out.println("No non-repeating character in string");
			
		

	}

}
