package IO_FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buf_reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("Text.txt");
		f1.createNewFile();
		BufferedWriter bw=new BufferedWriter(new FileWriter("Text.txt"));
		bw.write(" Hello \n World\n How are your Grandparents\n is this okay");
		bw.close();
		BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
		String l1;
		while((l1=br.readLine()) != null){
			System.out.println(l1);
			
		}
		br.close();

	}

}
