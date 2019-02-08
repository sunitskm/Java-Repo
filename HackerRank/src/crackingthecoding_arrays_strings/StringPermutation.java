package crackingthecoding_arrays_strings;

import java.util.Scanner;

public class StringPermutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your two strings");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		int[] arr = new int[26];
		
		for(int i = 0; i<arr.length;i++) {
			arr[i]=0;
		}
		for(int i=0; i<str1.length(); i++) {
			arr[str1.charAt(i)%65]++;
		}
		for(int i=0; i<str2.length(); i++) {
			arr[str2.charAt(i)%65]--;
		}
		boolean flag = true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				flag = false;
			}
		}
		
		if(flag) {
			System.out.println("It is a permutation");
		}
		else {
			System.out.println("It is not a permutation");
		}
		
		String str = "Mr    John    Smith   "; 
        
        // Trim the given string 
        str = str.trim(); 
          
        // Replace All space (unicode is \\s) to %20 
        str = str.replaceAll("\\s", "%20"); 
          
        // Display the result 
        System.out.println(str); 
		
		
		
		
		
		
		
		
	}
	
}
