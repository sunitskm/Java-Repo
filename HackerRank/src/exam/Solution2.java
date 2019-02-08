package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {
	public static List<Integer> cellCompete(int[] states,int days){
		
		int[] arr = Arrays.copyOfRange(states, 0, states.length);
		for(int k=0;k<days;k++) {
			for(int i=0;i<states.length;i++) {
				if(i==0) {
					if(arr[1]==0) {
						states[i]=0;
					}
					else {
						states[i]=1;
					}
				}
				else if(i==states.length-1) {
					if(arr[i-1]==0) {
						states[i]=0;
					}
					else {
						states[i]=1;
					}
				}
				else {
					if(arr[i-1]==arr[i+1]) {
						states[i]=0;
					}
					else {
						states[i]=1;
					}
				}
				if(i==states.length-1) {
					arr = Arrays.copyOfRange(states, 0, states.length);
				}
				//System.out.println("1st cell "+states[i]);
			}
				
		}
		List<Integer> finalList = new ArrayList<>();
		for(int i:states) {
			finalList.add(i);
		}
		return finalList;
	}
	public static void main(String[] args) {
		int[] arr = {1,1,1,0,1,1,1,1};
		for(int i=1;i<=28;i++) {
		System.out.println("Day "+i+" "+cellCompete(arr, i));
		}
	}
}
