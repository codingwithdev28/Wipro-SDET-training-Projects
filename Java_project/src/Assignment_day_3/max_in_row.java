package Assignment_day_3;

import java.util.Scanner;

public class max_in_row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the row");
		int m=sc.nextInt();
		System.out.println("Enter the column");
		int n=sc.nextInt();
		System.out.println("Enter the array");
		int[][] A=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				A[i][j] =sc.nextInt();
		}
		}
		for(int i=0;i<m;i++) {
			int max=A[i][0];
			for(int j=0;j<n;j++) {
				if(A[i][j]>max) {
					max=A[i][j];
				}
		}
		System.out.println("Max in row "+(i+1)+" : "+max);	
		}

	}

}
