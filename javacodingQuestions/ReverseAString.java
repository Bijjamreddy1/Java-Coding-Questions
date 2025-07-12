package javacodingQuestions;

public class ReverseAString {

	public static void main(String[] args) {
		String input="ABCDE";
		
		String output=reverseString(input);
		System.out.println(output);
	}

	private static String reverseString(String input) {
		
		char[] chars=input.toCharArray();
		int left=0, right=chars.length-1;
		
		while(left < right) {
			char temp=chars[left];
			chars[left]=chars[right];
			chars[right]=temp;
			
			left++;
			right--;
			
		}
		
		return new String(chars);
		
	}

}
