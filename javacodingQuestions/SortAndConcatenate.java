package javacodingQuestions;

import java.util.Arrays;

public class SortAndConcatenate {

	public static void main(String[] args) {

		String input="venkat,rami,reddy";
		String op=sortAndConcatenate(input);
		System.out.println(op);
	}

	private static String sortAndConcatenate(String input) {
		
		String[] parts=input.split(",");
		Arrays.sort(parts);
		return String.join("", parts);
		
	}

}
