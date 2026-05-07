package IO_FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Append_in_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("Append.txt");
		f1.createNewFile();
		FileWriter wt=new FileWriter("Append.txt",true);
		wt.write("\nThis is appended text");
		wt.write("\nThis is second appended text");
		wt.close();
		Scanner sc = new Scanner(f1);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		

	}

}
