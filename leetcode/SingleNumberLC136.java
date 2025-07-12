package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumberLC136 {

	public static void main(String[] args) {

		int[] nums = {4,1,2,1,2};
		
		int op=singleNumber(nums);
		System.out.println(op);
	}

	private static int singleNumber(int[] nums) {
		
		Map<Integer, Integer> map=new HashMap<>();
		int output=0;
		
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				output=entry.getKey();
			}
		}
		
		return output;
		
	}

}
