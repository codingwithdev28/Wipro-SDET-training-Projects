package control_loop_statements;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=5-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		for(int i=0;i<5;i++) {
			for(int k=0;k<i+1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=7-2*i;j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}

	}

}
