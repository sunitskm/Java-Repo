package crackingthecoding_arrays_strings;
import java.util.*;
public class isRotationSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter s1");
		String s1 = sc.nextLine();
		System.out.println("Enter s2");
		String s2 = sc.nextLine();
		s1 = s1+=s1;
		System.out.println((s1.indexOf(s2)!=-1)&&s1.length()==s2.length());
		//System.out.println(s1.substring(2));
	}
}
