package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSetRecursion {
	public static void subSet(String s) {
		String remS = "";
		subSetHelper(s,remS);
		
	}
	public static void subSetHelper(String s,String remS) {
		if(s.equals("")) {
			System.out.println(remS);
			return;
		}
		if(s.length()>=2) {
			//System.out.println(s);
			subSetHelper(s.substring(1, s.length()), remS);
			subSetHelper(s.substring(1, s.length()), remS+s.substring(0,1));
		}
		/*
		 * else { //System.out.println(s); subSetHelper("", remS); subSetHelper("",
		 * remS+s.substring(0,1)); }
		 */
		
	}
	
	
	
	public static void subsetArray(List<Integer> n) {
		List<Integer> remN = new ArrayList<>();
		 subsetArrayHelper(n,remN);
	}
	
	public static void subsetArrayHelper(List<Integer> n,List<Integer> remN) {
		if(n.size()==0) {
			System.out.println(remN);
		}
		
		subsetArrayHelper(n.subList(1, n.size()), remN);
		remN.add(remN.size(), n.get(0));
		subsetArrayHelper(n.subList(1, n.size()), remN);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
String s = "Sowmya";
		subSet(s);
		int[] n = new int[10];
		System.out.println(n.length);
	}
	
}
