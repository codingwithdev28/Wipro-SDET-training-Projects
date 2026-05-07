package Assignment_Day_2;

import java.util.Scanner;

public class Food {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int C;
		do {
			System.out.println("FOOD MENU");
			System.out.println("1.Burger");
			System.out.println("2.Pizza");
			System.out.println("3.Sandwich");
			System.out.println("4.Fries");
			System.out.println("5.Rolls");
			System.out.println("6.Exit");
		System.out.println("Enter Your food item no from list to know price");
		C=sc.nextInt();
		
		switch(C)
		{
		case 1:System.out.println("Burger: "+89);
		break;
		case 2:System.out.println("Pizza: "+89);
		break;
		case 3:System.out.println("Sandwich: "+89);   	   
		break;
		case 4:System.out.println("Fries: "+89);
		break;
		case 5:System.out.println("Rolls: "+89);
		break;
		case 6:System.out.println("Okkkk Now exit.");
		break;
			
		}
	
		}while(C!=6);

	}

}
