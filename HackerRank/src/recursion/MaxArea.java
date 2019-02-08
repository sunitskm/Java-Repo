package recursion;

import java.util.Arrays;

public class MaxArea {
	static int max = 0;
	public static int maxArea(int[] height) {
		if(height.length<=1) {
			return 0;
		}
		//System.out.println("Calling the function on array ");
		//displayArray(height);
		//int max = 0;
		int p1 = height[0];
		int p2 = height[height.length-1];
		int dist = height.length-1;
		int val = dist*findMin(p1,p2);
		
		if(max<val) {
			max=val;
		}
		
		int[] arr1 = Arrays.copyOfRange(height, 1, height.length);
		int[] arr2 = Arrays.copyOfRange(height, 0, height.length-1);
		int[] arr3 = Arrays.copyOfRange(height, 1, height.length-1);
		maxArea(arr1);
		maxArea(arr2);
		maxArea(arr3);
		return max;
	}
	public static void displayArray(int[] height) {
		for(int i = 0;i<height.length;i++) {
			System.out.print(height[i]+" ");
		}
	}
	public static int findMin(int p1,int p2) {
		if(p1>=p2) {
			return p2;
		}
		return p1;
	}
	public static void main(String[] args) {
		int[] arr = {1,1};
		System.out.println(maxArea(arr));
	}
}
