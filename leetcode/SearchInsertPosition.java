package leetcode;

public class SearchInsertPosition {

	public static void main(String[] args) {

		int[] nums = {1,3,5,6}; int target = 5;
		
		int op=searchInsert(nums, target);
		System.out.println(op);
	}

	private static int searchInsert(int[] nums, int target) {
		
		int index = 0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == target || nums[i]>target) {
				return i;
			} 
			index=i;
			
		}
		return index+1;
	}

}
