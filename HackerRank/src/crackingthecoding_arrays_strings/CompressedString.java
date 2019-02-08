package crackingthecoding_arrays_strings;

import java.util.Scanner;

public class CompressedString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string to compress ");
		String str = sc.nextLine();
		sc.close();
		Character c = ' ';
		int count = 0;
		String newStr = "";
		String semiStr = "";
		boolean flag = false;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=c) {
				if(count>1) {
					semiStr = c.toString()+Integer.toString(count);
					newStr+=semiStr;
					flag = true;
				}
				if(count==1) {
					newStr+=c.toString()+"1";
				}
				count=1;
				c = str.charAt(i);
			}
			else {
				count++;
			}
		}
		if(count>1) {
			semiStr = c.toString()+Integer.toString(count);
			newStr+=semiStr;
			flag = true;
		}
		if(count==1) {
			newStr+=c.toString()+"1";
		}
		if(flag) {
		System.out.println("The new string is "+newStr);
		}
		else {
			System.out.println(str);
		}
	}
}
