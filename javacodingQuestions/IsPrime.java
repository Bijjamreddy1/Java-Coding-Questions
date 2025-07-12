package javacodingQuestions;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		boolean output=isPrime(num);
		System.out.println(output);
	}

	private static boolean isPrime(int num) {
		
		if(num <=1) return false;
		if(num <=3) return true;
		
		if (num % 2 ==0 || num % 3 ==0) {
			return false;
		}
		
		for(int i=5; i*i<=num; i+=6) {
			if(num % i==0 || num % (i+2) ==0) {
				return false;
			}
		}
		
		return true;
		
		
	}

}
