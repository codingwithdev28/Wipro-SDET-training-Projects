package Assignment_day_3;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the array");
		int[] A=new int[n];
		for(int i=0;i<n;i++) {
			A[i] =sc.nextInt();
		}
		boolean p=true;
		for(int i=0;i<n/2;i++) {
			if(A[i]!=A[n-1-i]) {
				p=false;
				System.out.println("Array is not palindrome");
				break;
			}
		}
		if(p) {
			System.out.println("Array is palindrome");
		}
		
		
	}

}
