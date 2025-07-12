package leetcode;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {

		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		int op=RemoveDuplicatesfromSortedArray(nums);
		System.out.println(op);
	}

	private static int RemoveDuplicatesfromSortedArray(int[] nums) {
		
		int i=1;
		
		for(int j=1;j<nums.length;j++) {
			if(nums[j] !=nums[j-1]) {
				nums[i]=nums[j];
				i++;
			}
		}
		return i;
	}

}
