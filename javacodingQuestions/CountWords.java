package javacodingQuestions;

import java.util.HashMap;

public class CountWords {

	public static void main(String[] args) {

		String input="Venkata Rami Reddy Venkata";
		
		HashMap<String, Integer> output=  countWords(input);
		System.out.println(output);
		
		
	}

	private static HashMap<String, Integer> countWords(String input) {

		HashMap<String, Integer> countWords=new HashMap<>();
		
		String[] words=input.split("\\s+");
		
		for(String word:words) {
			countWords.put(word, countWords.getOrDefault(word, 0)+1);
		}
		
		return countWords;
	}

}
