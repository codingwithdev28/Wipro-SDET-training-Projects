package Assignment_Day_10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Append {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Text");
		String s=sc.nextLine();
		FileWriter wt=new FileWriter("Text.txt",true);
		wt.write("\n"+s);
		wt.close();
		File f=new File("Text.txt");
		Scanner sct = new Scanner(f);
		while(sct.hasNextLine()) {
			System.out.println(sct.nextLine());
		}
		sc.close();
		sct.close();

	}

}
