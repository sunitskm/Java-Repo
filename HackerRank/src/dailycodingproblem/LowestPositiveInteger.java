//cerner_2^5_2019
package dailycodingproblem;

public class LowestPositiveInteger {
	public static int findLowest(int[] arr) {
		int[] x = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			x[i]=0;
		}
		int min = 1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				if(arr[i]>=arr.length) {
					x[arr.length-1]=1;
				}
				else {
					x[arr[i]]=1;
				}
			}
		}
		int val=1;
		
		while(val<x.length && x[val]!=0) {
			val++;
			//System.out.println(val);
		}
		
		return val;
	}
	public static void main(String[] args) {
		int[] arr = {-1,1,-2,-4,-6};
		System.out.println(findLowest(arr));
		
	}
}
