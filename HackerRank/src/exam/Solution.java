package exam;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static void main(String[] args) {
		int num[]= {2,7,11,15};
		System.out.println();
		int[] result = twoSum(num,9);
		for(int i:result) {
			System.out.println(i);
		}
	}
	public static int[] twoSum(int[] nums,int target) {
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int x = target-nums[i];
			if(hm.containsKey(x)) {
				return(new int[] {i,hm.get(x)});
			}
			else {
				hm.put(nums[i], i);
			}
				
		}
		
		return null;
	}
}
