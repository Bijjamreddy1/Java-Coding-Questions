package javacodingQuestions;

public class SecondHighest {

	public static void main(String[] args) {

		int[] nums= {1, 2,3, 4};
		
		int op=secondHighest(nums);
		System.out.println(op);
	}

	private static int secondHighest(int[] nums) {
		
		int highest=Integer.MIN_VALUE;
		int secondHighest=Integer.MIN_VALUE;
		
		for(int num:nums) {
			if(num > highest) {
				secondHighest=highest;
				highest=num;
			}
			else if(num > secondHighest && num !=highest) {
				secondHighest=num;
			}
		}
		
		return secondHighest;
	}

}
