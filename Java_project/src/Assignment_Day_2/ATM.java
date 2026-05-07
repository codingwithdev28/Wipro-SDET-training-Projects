package Assignment_Day_2;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int C;
		double balance=52000;
		do {
			System.out.println("ATM MENU FOR YOU");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
		System.out.println("Enter Your choice");
		C=sc.nextInt();
		
		switch(C)
		{
		case 1:System.out.println("Balance: "+balance);
		break;
		case 2:System.out.println("Enter amount to Deposit");
		       double deposit=sc.nextDouble();
		       balance+=deposit;
		       System.out.println("Your amount is succesfully deposited");
		break;
		case 3:System.out.println("Enter amount to Withdraw");
	           double withdraw=sc.nextDouble();
	           if(withdraw<balance) {
	        	   balance-=withdraw;
	        	   System.out.println("Your amount is succesfully withdraw, Collect your Cash");
	           }
	           
	           else
	        	   System.out.println("Exceed Limit");    	   
		break;
		case 4:
			System.out.println("Successfully Exit");
			break;
		}
	
		}while(C!=4);
	}

}
