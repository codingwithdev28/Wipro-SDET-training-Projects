package IO_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count_char {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
		String l1;
		int j=1;
		while((l1=br.readLine()) != null){
			int c=0;
			
			for(int i=0;i<l1.length();i++) {
				
				if(l1.charAt(i)!=' ' && l1.charAt(i)!='\t') {
					c++;
				}
			}
			
			System.out.println("Character in line "+j+"= "+c);
			j++;
		}
		br.close();
		

	}

}
