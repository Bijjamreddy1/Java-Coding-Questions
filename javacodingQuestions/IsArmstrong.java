package javacodingQuestions;

import java.util.Scanner;

public class IsArmstrong {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an number to check if it is Armstrong number:");
		int num=sc.nextInt();
		
		if(isArmstrong(num)) {
			System.out.println("Given number is Armstrong");
		} else {
			System.out.println("Not an Armstrong");
		}
		
		sc.close();
	}

	private static boolean isArmstrong(int num) {
		
		int originalNumber=num;
		int sum=0;
		
		// Count the number of digits
		int temp=num;
		int n=0;
		
		while(temp>0) {
			temp /=10;
			n++;
		}
		
		temp=num;
		
		while(temp>0) {
			int digit=temp%10;
			sum +=Math.pow(digit, n);
			temp /=10;
		}
		
		return sum == originalNumber;
		
		
	}

}
