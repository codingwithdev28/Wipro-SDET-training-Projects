package IO_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count_lines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
		String l1;
		int c=0;
		while((l1=br.readLine()) != null){
			c++;
			
		}
		br.close();
		System.out.println("No of lines in the file: "+c);

	}

}
