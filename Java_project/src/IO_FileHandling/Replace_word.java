package IO_FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Replace_word {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("Replace.txt");
		f1.createNewFile();
		BufferedWriter bw=new BufferedWriter(new FileWriter("Replace.txt"));
		bw.write(" Hello Student \n Today we are going to learn Python \n Python is a basic programming language");
		bw.close();
		System.out.println("This is before replacing\n");
		BufferedReader br1=new BufferedReader(new FileReader("Replace.txt"));
		String l1;
		while((l1=br1.readLine()) != null){
				
			System.out.println(l1);
		}
		br1.close();
		System.out.println("\n\nThis is after replacing\n");
		BufferedReader br2=new BufferedReader(new FileReader("Replace.txt"));
		String l2;
		
		while((l2=br2.readLine()) != null){
			l2=l2.replace("Python", "Java");		
			System.out.println(l2);
		}
		
		
		br2.close();

	}

}
