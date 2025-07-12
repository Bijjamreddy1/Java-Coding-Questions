package javacodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums= {1, 2, 3, 4, 5, 6};
		int target=7;
		
		int[] op=twoSum(nums, target);
		
		if(op !=null) {
			System.out.println("Indices "+ op[0] + " and " + op[1]);
		}
		
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
