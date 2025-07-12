package javacodingQuestions;

public class RemoveElement {

	public static void main(String[] args) {

		int[] nums= {1, 2, 3, 4, 5, 6}; int val=5;
		
		int op=removeElement(nums, val);
		System.out.println(op);
	}

	private static int removeElement(int[] nums, int val) {
		
		int i=0;
		for(int j=0;j<nums.length;j++) {
			if(nums[j] != val) {
				nums[i] =nums[j];
				i++;
			}
			
		}
		return i;
	}

}
