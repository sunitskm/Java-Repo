
public class Solution {
	public static String solution(String s) {
		String s1 = s.replaceAll("\\s","");
		s1 = s1.replaceAll("-","");
		if(s1.length()<=3) {
			return s1;
		}
		if(s1.length()%3==1) {
			String lastString = s1.substring(s1.length()-4, s1.length());
			lastString = lastString.substring(0,2)+"-"+lastString.substring(2,4);
			
			System.out.println(lastString);
			String firstString = s1.substring(0, s1.length()-4);
			String first = "";
			for(int i = 0;i<firstString.length();i+=3) {
				first += firstString.substring(i, i+3)+"-";
			}
			String finalString = first+lastString;
			//System.out.println(first+lastString);
			//System.out.println(s1.substring(s1.length()-4, s1.length()));
			//System.out.println(s1.substring(0, s1.length()-4));
			return finalString;
			
		}
		else if(s1.length()%3==2) {
			String lastString = s1.substring(s1.length()-2, s1.length());
			
			
			System.out.println(lastString);
			String firstString = s1.substring(0, s1.length()-2);
			System.out.println(firstString);
			String first = "";
			for(int i = 0;i<firstString.length();i+=3) {
				first += firstString.substring(i, i+3)+"-";
			}
			String finalString = first+lastString;
			//System.out.println(first+lastString);
			//System.out.println(s1.substring(s1.length()-4, s1.length()));
			//System.out.println(s1.substring(0, s1.length()-4));
			return finalString;
		}
		else {
			String firstString = s1;
			System.out.println(firstString);
			String first = "";
			for(int i = 0;i<firstString.length();i+=3) {
				first += firstString.substring(i, i+3)+"-";
			}
			String finalString = first.substring(0,first.length()-1);
			//System.out.println(first+lastString);
			//System.out.println(s1.substring(s1.length()-4, s1.length()));
			//System.out.println(s1.substring(0, s1.length()-4));
			return finalString;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(solution("Hello---- Sunitsa"));
	}
}
