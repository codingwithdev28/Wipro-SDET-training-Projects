package IO_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Largest_word {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader("Text.txt"));
		String l1;
		String lword="";
		while((l1=br.readLine()) != null){
			String word="";
			
			for(int i=0;i<=l1.length();i++) {
				if(i<l1.length()&& l1.charAt(i)!=' ' && l1.charAt(i)!='\t') {
					word+=l1.charAt(i);
				}else {
					if(word.length()>lword.length()) {
						lword=word;
					}
					word="";
				}
			}
			
			
	
		}
		br.close();
		System.out.println("Largest word in file: "+lword);
		
	}

}
