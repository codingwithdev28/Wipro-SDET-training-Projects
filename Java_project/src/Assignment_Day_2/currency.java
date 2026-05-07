package Assignment_Day_2;

import java.util.Scanner;

public class currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int C;
		Double r;
		System.out.println("You can convert Indian Rupees(INR) into this currency");
		System.out.println("Enter indian rupees amount");
		r=sc.nextDouble();
		do {
			
			System.out.println("1.USD");
			System.out.println("2.EURO");
			System.out.println("3.Dirham");
			System.out.println("4.Ruble");
			System.out.println("5.Yen");
			System.out.println("6.Exit");
			
		System.out.println("Enter the currency no from list");
		C=sc.nextInt();
		
		switch(C)
		{
		case 1:System.out.println("USD: "+(r*0.011));
		break;
		case 2:System.out.println("EURO: "+(r*0.0091));
		break;
		case 3:System.out.println("Dirham: "+(r*0.039));   	   
		break;
		case 4:System.out.println("Ruble: "+(r*0.80));
		break;
		case 5:System.out.println("Yen: "+(r*1.69));
		break;
		case 6:System.out.println("Okkkk Done.");
		break;
			
		}
	
		}while(C!=6);


	}

}
