package Assignment_Day_8;

import java.util.HashMap;

public class Library_Managment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Boolean> m=new HashMap<>();
		m.put("Mathematics", true);
		m.put("Anatomy", false);
		m.put("Biology", false);
		m.put("Zoology", true);
		m.put("Physics", false);
		m.put("Advance Python", true);
		
		String book="Anatomy";
		if(m.containsKey(book) && m.get(book)) {
			System.out.println("Yes available");
		}
		else {
			System.out.println("Not available");
		}

	}

}
