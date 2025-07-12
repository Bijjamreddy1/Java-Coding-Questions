package javacodingQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {

	public static void main(String[] args) {

	HashMap<String, String> input=new HashMap<>();
		IterateHashMap(input);
	}

	private static void IterateHashMap(HashMap<String, String> input) {
		
		//Using Advance for loop
		for(Map.Entry<String, String> entry:input.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		
		//Using While-loop iterator
		
		Iterator<Map.Entry<String, String>> iterator=input.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> entry=iterator.next();
			System.out.println(entry.getKey()+ " "+ entry.getValue());
		}
		
		
		
		
	}

}
