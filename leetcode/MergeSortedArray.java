package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6};
		int m = 3, n = 3;
		
		int[] op=merge(nums1, nums2, m, n);
		System.out.println(Arrays.toString(op));
	}

	private static int[] merge(int[] nums1, int[] nums2, int m, int n) {
		
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<m;i++) {
			list.add(nums1[i]);
		}
		
		for(int i=0;i<n;i++) {
			list.add(nums2[i]);
		}
		
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++) {
			nums1[i]=list.get(i);
		}
		
		return nums1;
		
	}

}
