package Assignment_day_3;

import java.util.Scanner;

public class asc_desc {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the size of array");
			int n=sc.nextInt();
			System.out.println("Enter the array");
			int[] A=new int[n];
			for(int i=0;i<n;i++) {
				A[i] =sc.nextInt();
			}
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-1-i;j++) {
				if(A[j]>A[j+1]) {
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
			}
			System.out.println("Array in ascending order: ");
			for(int i=0;i<n;i++) {
				System.out.print(A[i]+" ");
			}
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-1-i;j++) {
				if(A[j]<A[j+1]) {
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
			}
			System.out.println("\nArray in descending order: ");
			for(int i=0;i<n;i++) {
				System.out.print(A[i]+" ");
			}
			


		}


	

}
