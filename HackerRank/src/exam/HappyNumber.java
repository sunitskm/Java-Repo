package exam;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	public boolean isHappy(int n) {
		Set<Integer> s = new HashSet<>();
		int n1 = n;
		while(n1!=0) {
		int sum = 0;
		while(n1!=0) {
			int d = n1%10;
			sum+=d*d;
			n1/=10;
		}
		n1 = sum;
		if(n1==1) {
			return true;
		}
		else if(s.contains(n1)) {
			return false;
		}
		else {
			s.add(n1);
		}
	}
		return false;
	}
	public static void main(String[] args) {
		HappyNumber h1 = new HappyNumber();
		System.out.println(h1.isHappy(19));
				
	}
}
