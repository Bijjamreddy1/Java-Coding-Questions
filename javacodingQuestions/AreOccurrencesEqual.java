package javacodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class AreOccurrencesEqual {

	public static void main(String[] args) {

		String input="aabbcc";
		boolean op=areOccurrencesEqual(input);
		System.out.println(op);
	}

	private static boolean areOccurrencesEqual(String input) {
		
		Map<Character, Integer> freqMap=new HashMap<>();
		for(char ch:input.toCharArray()) {
			freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
		}
		
		int freq=-1;
//		for(int count: freqMap.values()) {
//			if(freq == -1) {
//				freq=count;
//			} else if (freq !=count) {
//				return false;
//			}
//		}
		
		for(Map.Entry<Character, Integer> entry:freqMap.entrySet()) {
			if(freq ==-1) {
				freq=entry.getValue();
			} else if(freq != entry.getValue()) {
				return false;
			}
		}
		
		return true;
		
	}

}
