package recursion;

import java.util.HashSet;
import java.util.Set;

public class LCSRecursive {
	
	
	public static int findLengthLCS(String str1, String str2) {
		if(str1.length()==0||str2.length()==0) {
			return 0;
		}
		if(str1.charAt(0)==str2.charAt(0)) {
			return 1+findLengthLCS(str1.substring(1), str2.substring(1));
		}
		else {
			int x = findLengthLCS(str1.substring(1), str2)>
					findLengthLCS(str1, str2.substring(1))
					?findLengthLCS(str1.substring(1), str2)
					:findLengthLCS(str1, str2.substring(1));
			return x;
		}
	}
	
	
	public static int findLengthLCS(String str1, String str2, int[][] arr) {
		for(int i = 1;i<arr.length;i++) {
			for(int j = 1;j<arr[0].length;j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					arr[i][j] = arr[i-1][j-1]+1;
				}
				else {
					arr[i][j] = (arr[i-1][j]>arr[i][j-1])?arr[i-1][j]:arr[i][j-1];
				}
			}
		}
		return arr[arr.length-1][arr[0].length-1];
	}
	
	
	
	
	public static void main(String[] args) {
		String str1 = "abcbdab";
		String str2 = "bdcaba";
		int[][] arr = new int[str1.length()+1][str2.length()+1];
		for(int i = 0;i<arr.length;i++) {
			arr[i][0] = 0;
			
		}
		for(int i = 0;i<arr[0].length;i++) {
			arr[0][i] = 0;
			
		}
		
		System.out.println(findLengthLCS(str1, str2, arr));
		display(arr);
		findLCS(arr,str1,str2);
		int r = arr.length-1;
		int c = arr[0].length-1;
		
		System.out.println("Priting all the possible subsequences");
		findAllLCS(arr,str1, str2, r,c,"",new HashSet<String>());
		//System.out.println(findLengthLCS(str1, str2));
	}
	
	
	 public static void findAllLCS(int[][] arr, String str1,String str2,int r, int c, String str,Set<String> set) {
			if(r<=0 || c<=0) {
				if(!set.contains(str)) {
					System.out.println(str);
					set.add(str);
				}
				return;
			}
			if(str1.charAt(r-1)==str2.charAt(c-1)) {
				str =Character.toString(str1.charAt(r-1))+str;
				findAllLCS( arr, str1,str2,  r-1,  c-1, str,set); 
			}
			else {
				if(arr[r-1][c]==arr[r][c-1]) {
					findAllLCS( arr, str1, str2, r-1,  c, str,set);
					findAllLCS( arr,str1,str2,  r,  c-1, str,set);
				}
				else {
					if(arr[r-1][c]>arr[r][c-1])
						findAllLCS( arr,str1, str2,  r-1,  c, str,set);
					else
						findAllLCS( arr,str1, str2,  r,  c-1, str,set);
				}
			}
		}
		
	
	public static void display(int[][] arr) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void findLCS(int[][] arr,String str1, String str2) {
		
		int r = arr.length-1;
		int c = arr[0].length-1;
		String ch = "";
		while(true) {
			if(r<=0||c<=0) {
				break;
			}
			if(str1.charAt(r-1)==str2.charAt(c-1)) {
				ch = Character.toString(str1.charAt(r-1))+ch;
				r--;
				c--;
			}
			else {
				if(arr[r-1][c]>arr[r][c-1]) {r--;}
				else{
					c--;
				}
				}
			}
		System.out.println(ch);
		}
   
    }
