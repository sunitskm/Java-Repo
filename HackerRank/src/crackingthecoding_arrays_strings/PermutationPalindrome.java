package crackingthecoding_arrays_strings;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class PermutationPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		sc.close();
		str = str.toLowerCase();
		Map<Character,Integer> hm = new HashMap<>();
		for(int i = 0;i < str.length();i++) {
			Character c = str.charAt(i);
			if(hm.containsKey(c)) {
				int prev = hm.get(c);
				hm.put(c, ++prev);
			}
			else {
				hm.put(c,1);
			}
		}
		
		//Iterate over the map. Iterators are not available in maps
		int numOfOdds = 0;
		for(Map.Entry<Character,Integer> e:hm.entrySet()) {
			System.out.println("Key is "+e.getKey()+" Value is:"+e.getValue());
			if(e.getValue()%2==1 && e.getKey()!=' ') {
				numOfOdds++;
			}
		}
		System.out.println(numOfOdds);
		if(numOfOdds>1) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		
		
	}
}
