package recursion;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] str) {
		String finalStr = longestCommonPrefixHelper(str,"");
		return finalStr;
	}
	public static String longestCommonPrefixHelper(String[] str,String prefix) {
		if(str.length==0) {
			return prefix;
		}
		//display(str);
		System.out.println("Prefix is "+prefix);
		for(int i=0;i<str.length;i++) {
			if(str[i].equals("")) {
				return prefix;
			}
		}
		String ch = str[0].substring(0, 1);
	
		//str[0] = str[0].substring(1, str[0].length());
		for(int i=0;i<str.length;i++) {
			if(!str[i].substring(0, 1).equals(ch)) {
				System.out.println("Oops does not match anymore. "+prefix);
				return prefix;
			}
			else if(str[i].length()>1)
				str[i] = str[i].substring(1, str[i].length());
			else
				str[i]="";
		}
		prefix= prefix+ch;
		return longestCommonPrefixHelper(str, prefix);
//		System.out.println("Hey I am going to return in line 34 "+prefix);
//		return prefix;
	}
	
	public static void display(String[] s) {
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		String[] s = {"Sujit","Suhail","Suit","Susan"};
		//System.out.println(s.substring(6,7));
		System.out.println(longestCommonPrefix(s));
	}
}

