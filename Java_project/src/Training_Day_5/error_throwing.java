package Training_Day_5;

import java.util.Scanner;

public class error_throwing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		int b= 88;
		try {
			int c= b/a;
			System.out.println("Division= "+c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("End");
		/*try {
			String str=null;
			System.out.println(str.length());
		}
		catch(Exception e){
			System.out.println(e);
		}
		*/

	}

}
