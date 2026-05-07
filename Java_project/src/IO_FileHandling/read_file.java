package IO_FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read_file {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("test.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		

	}

}
