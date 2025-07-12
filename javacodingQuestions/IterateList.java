package javacodingQuestions;

import java.util.ArrayList;

public class IterateList {

	public static void main(String[] args) {

		ArrayList<String> array=new ArrayList<>();
		
		array.add("venkat");
		array.add("mano");
		array.add("raja");
		
		//Using for loop
		
		for(int i=0; i<array.size();i++) {
			System.out.println(array.get(i));
		}
		
		//Using while loop
		
		int idx=0;
		while(idx<array.size()) {
			System.out.println(array.get(idx));
			idx++;
		}
		
		//Using advanced for loop
		
		for(String i:array) {
			System.out.println(i);
		}
		
	}

}
