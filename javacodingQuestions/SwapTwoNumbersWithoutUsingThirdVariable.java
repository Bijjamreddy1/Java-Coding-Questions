package javacodingQuestions;

public class SwapTwoNumbersWithoutUsingThirdVariable {

	public static void main(String[] args) {

		int a=10,b=15;
		
		SwapTwoNumbersWithoutUsingThirdVariable(a,b);
	}


	private static void SwapTwoNumbersWithoutUsingThirdVariable(int a, int b) {

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap: a = " + a + ", b = " + b);
		 
	}

}
