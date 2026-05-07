package Assignment_Day_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count_JAVA {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub;
		BufferedReader br=new BufferedReader(new FileReader("Assignment.txt"));
		String l1;
		int count=0;
		while((l1=br.readLine()) != null){
			String [] words=l1.toLowerCase().split("\\W+");
			
			for(String c:words) {
				if(c.equals("java")) {
					count++;
				}
			}
 			
				
		}
		br.close();
		System.out.println("Total no of 'java' words in file: "+count);

	}

}
