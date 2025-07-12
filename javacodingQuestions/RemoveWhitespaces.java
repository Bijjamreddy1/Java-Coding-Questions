package javacodingQuestions;

public class RemoveWhitespaces {

	public static void main(String[] args) {

		String input="Hello this is venkat";
		
		String op=removeWhitespaces(input);
		System.out.println(op);
	}

	private static String removeWhitespaces(String input) {
		
		StringBuilder str=new StringBuilder();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) != ' ') {
				str.append(input.charAt(i));
			}
		}
		
		return str.toString();
		
	}

}
