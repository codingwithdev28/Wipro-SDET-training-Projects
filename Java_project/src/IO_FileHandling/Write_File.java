package IO_FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write_File {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file = new File("demo.txt");
		file.createNewFile();// here this create a new file named demo.txt
		FileWriter wr = new FileWriter("demo.txt");
		wr.write("This is written with java program in demo text file");
		wr.close();
		
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		

	}

}
