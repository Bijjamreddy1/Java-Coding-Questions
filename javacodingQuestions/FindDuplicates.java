package javacodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

	public static void main(String[] args) {

		String input="manoranjan";
		
		findDuplicates(input);
	}

	private static void findDuplicates(String input) {

		HashMap<Character, Integer> countChar=new HashMap<>();
		
		for(char ch:input.toCharArray()) {
			countChar.put(ch, countChar.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry: countChar.entrySet()) {
			if(entry.getValue() >1) {
				System.out.println(entry.getKey()+ " appears " + entry.getValue()+ " times");
			}
		}
	}

}
