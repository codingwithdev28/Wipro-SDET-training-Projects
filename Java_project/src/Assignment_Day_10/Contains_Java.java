package Assignment_Day_10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Contains_Java {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw=new BufferedWriter(new FileWriter("Assignment.txt",true));
		bw.write("\nI am adding this java line with Buffer reader ");
		bw.write("\nThank You ");
		bw.close();
		BufferedReader br=new BufferedReader(new FileReader("Assignment.txt"));
		String l1;
		while((l1=br.readLine()) != null){
			if(l1.toLowerCase().contains("java")) {
				System.out.println(l1);
			}
			
			
		}
		br.close();

	}

}
