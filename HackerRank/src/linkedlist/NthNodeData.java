package linkedlist;

public class NthNodeData {
	public static void main(String[] args) {
		Node2 n1 = new Node2(1);
		n1.addNode(2);
		n1.addNode(3);
		n1.addNode(5);
		n1.addNode(13);
		n1.addNode(7);
		n1.addNode(19);
		n1.addNode(25);
		System.out.println("Displaying the linked list");
		n1.display();
		System.out.println("Finding the nth Node");
		System.out.println(n1.findNthNode(5));
		
		
	}
}
class Node2{
	int value;
	Node2 next;
	public Node2(int value) {
		this.value = value;
		this.next = null;
	}
	public void addNode(int value) {
		Node2 current = this;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = new Node2(value);
	}
	public void display() {
		Node2 current = this;
		while(current!=null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	public int findNthNode(int n) {
		Node2 current = this;
		int n1 = n;
		while(n1!=1) {
			current = current.next;
			n1--;
		}
		return current.value;
	}
}
