package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Stack {
	private String arr[];
	int top;
	int maxSize;
	public Stack(int size) {
		this.maxSize = size;
		this.top = 0;
		arr = new String[maxSize];
	}
	public boolean IsEmpty() {
		if(top==0) {
			return true;
		}
		return false;
	}
	public void push(String str) {
		if(top>=maxSize) {
			System.out.println("Stack overflow error");
			return;
		}
		arr[top]=str;
		top++;
	}
	public int size() {
		return top;
	}
	
	public String peek() {
		if(!IsEmpty()) {
			return arr[top-1];
		}
		else {
			return null;
		}
	}
	public String pop() {
		String str = peek();
		if(str==null) {
			System.out.println("Stack is already empty. Cannot pop elements");
			return str;
		}
		top--;
		arr[top]=null;
		return str;
	}
	public void display() {
		for(int i=0;i<top;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push("Hello");
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push("Hello1");
		s.push("Hello2");
		s.push("Hello3");
		s.push("Hello4");
		s.push("Hello5");
		s.push("Hello6");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.display();
		Queue<Integer> q = new LinkedList<>();
		q.add(20);
		q.add(10);
		System.out.println(q.poll());
	}
	
}
