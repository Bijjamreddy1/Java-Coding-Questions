package javacodingQuestions;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		String word=sc.nextLine();
		
		boolean output=IsPalindrome(word); //madam
		System.out.println(output);
	}

	private static boolean IsPalindrome(String num) {
		int left=0, right=num.length()-1;
		
		while(left < right) {
			if(num.charAt(left) != num.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}

}
