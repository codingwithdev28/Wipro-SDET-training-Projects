package Assignment_Day_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count_Word_Line {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
		String l1;
		int count=0,j=0;
		while((l1=br.readLine()) != null){
			boolean b=false;
			for(int i=0;i<l1.length();i++) {
				char ch=l1.charAt(i);
				if(ch!=' '&& ch!='\t' && !b) {
					count++;
					b=true;
					
				}
				else if(ch==' '|| ch=='\t') {
					b=false;
				}
			}
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
		System.out.println("No of lines in the file: "+j);
		
		System.out.println("No of words in the Paragraph: "+count);

	}

}
