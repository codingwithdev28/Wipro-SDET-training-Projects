package IO_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count_word {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
		String l1;
		int c=0;
		while((l1=br.readLine()) != null){
			boolean b=false;
			for(int i=0;i<l1.length();i++) {
				char ch=l1.charAt(i);
				if(ch!=' '&& ch!='\t' && !b) {
					c++;
					b=true;
					
				}
				else if(ch==' '|| ch=='\t') {
					b=false;
				}
			}
		}
		br.close();
		System.out.println("No of words in the Paragraph: "+c);

	}

}
