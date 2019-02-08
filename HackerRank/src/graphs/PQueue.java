package graphs;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQueue implements Comparator<Integer> {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>(new PQueue());
		p.add(5);
		p.add(2);
		p.add(7);
		p.add(9);
		p.add(1);
		p.add(6);
		System.out.println(p);
		for(int i=0;i<6;i++) {
			System.out.println(p.poll());
		}
	}
	@Override
	public int compare(Integer n1, Integer n2) {
		if(n1>n2) {
			return -1;
		}
		return 1;
	}

}
