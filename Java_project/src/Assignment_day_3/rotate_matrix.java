package Assignment_day_3;

import java.util.Scanner;

public class rotate_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row or column for square matrix");
		int n=sc.nextInt();
		System.out.println("Enter the array");
		int[][] A=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				A[i][j] =sc.nextInt();
		}
		}
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp= A[i][j];
				A[i][j]= A[j][i];
				A[j][i]=temp;
		}
		}
		for(int i=0;i<n;i++) {
			int a=0;
			int b=n-1;
			while(a<b) {
				int temp= A[i][a];
				A[i][a]= A[i][b];
				A[i][b]=temp;
				a++;
				b--;
		}
		}
		System.out.println("Rotated Matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(A[i][j]+" ");
		}
			System.out.println();
		}
		

	}

}
