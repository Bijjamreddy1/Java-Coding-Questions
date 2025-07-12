package javacodingQuestions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		
		fibonacci(num);
		int op=fibonacciAnotherMethod(num);
		System.out.println(op);
		
	}

	private static int fibonacciAnotherMethod(int num) {
		
		if(num <=1) return num;
		return fibonacciAnotherMethod(num-1)+fibonacciAnotherMethod(num-2);
		
		
	}

	private static void fibonacci(int num) {
		
		int first=0, second=1;
		System.out.println("Fibonacci Series:");
		
		for(int i=0; i<=num; i++) {
			System.out.print(first + " ");
			int next=first+second;
			first=second;
			second=next;
			
		}
		System.out.println("");
		
	}

}
