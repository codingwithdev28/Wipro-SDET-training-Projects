package Assignment_Day_2;

import java.util.Scanner;

public class user_role {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int C;
		System.out.println("You can choose user role from list to see access");
		System.out.println("1.Admin");
		System.out.println("2.User");
		System.out.println("3.Guest");
		
	System.out.println("Enter choice");
	C=sc.nextInt();
	
	switch(C)
	{
	case 1:System.out.println("Admin has full access");
	       System.out.println("View all files");
	       System.out.println("Manage");
	       System.out.println("Modify");
	       
	break;
	case 2:System.out.println("User has limited access");
           System.out.println("View all files but not confidential");
           System.out.println("Manage");
           System.out.println("Can't Modify");
	break;
	case 3:System.out.println("Guest can view public files in read mode only");   	   
	break;
	default:System.out.println("Invalid choice");
    
	}

	}

}
