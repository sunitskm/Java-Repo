package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum {
	public static void subset(int[] nums,int total) {
		List<Integer> choices = new ArrayList<>();
	    subsetHelper(nums,total,choices);
	}
	
	public static void subsetHelper(int[] nums,int total,List<Integer> choices ) {
		if(total==0) {
			System.out.println(choices);
		}
		else if(total<0 || nums.length==0) {
			return;
		}
		else {
			choices.add(nums[0]);
			int[] arr1 = Arrays.copyOfRange(nums, 1, nums.length);
			subsetHelper(arr1, total-nums[0], choices);
			choices.remove(choices.size()-1);
			subsetHelper(arr1, total, choices);
		}
		
	}
	
	public static void main(String[] args) {
		int[] n = {5,3,7,9,1,2};
		subset(n, 12);
	}
}
