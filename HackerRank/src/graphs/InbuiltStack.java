package graphs;

import java.util.Stack;

public class InbuiltStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		System.out.println(s.peek());
		s.pop();
		//s.pop();
		System.out.println(s);
	}
}
