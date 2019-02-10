package memoization;

import java.util.*;

public class LCP {
	public static void main(String[] args) {
		System.out.println(findLCP("pqrdrpd", 0, 6,new HashMap<String,Integer>()));
	}
	public static int findLCP(String str,int i,int j,Map<String,Integer> hm) {
		if(i>j) {
			return 0;
		}
		if(i==j) {
			return 1;
		}
		String key = Integer.toString(i)+"|"+Integer.toString(j);
		if(!hm.containsKey(key)) {
			if(str.charAt(i)==str.charAt(j)) {
				hm.put(key, 2+findLCP(str, i+1, j-1,hm));
			}
			else{
				hm.put(key, Math.max(findLCP(str, i+1, j,hm), findLCP(str, i, j-1,hm)));
			}
		}
		return hm.get(key);
	}
}
