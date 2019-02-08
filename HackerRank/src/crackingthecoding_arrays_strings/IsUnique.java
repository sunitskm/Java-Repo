package crackingthecoding_arrays_strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IsUnique {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		str = str.toLowerCase();
		boolean flag = true;
		Set<Character> hs = new HashSet<>();
		for(int i = 0;i < str.length();i++) {
			if(!hs.add(str.charAt(i)))
				flag = false;
		}
		if(hs.size()!=str.length()) {
			System.out.println("Not unique");
		}
		else {
			System.out.println("Unique");
		}
		System.out.println("Unique? "+flag);
		
	}
}
