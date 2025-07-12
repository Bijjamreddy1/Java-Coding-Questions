package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = {2,7,11,15}; int target = 9;
		
		int[] op=twoSum(nums, target);
		System.out.println(op[0] + " "+op[1]);
	}

	private static int[] twoSum(int[] nums, int target) {
		
		Map<Integer, Integer> numsMap=new HashMap<>();
		
		for(int i=0;i<nums.length;i++) {
			int complement=target-nums[i];
			if(numsMap.containsKey(complement)) {
				return new int[] {numsMap.get(complement), i};
			}
			numsMap.put(nums[i], i);
		}
		return null;
	}

}
