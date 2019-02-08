package linkedlist;

public class ReverseLinkedList {
	public static void main(String[] args) {
		Node3 n1 = new Node3(5);
		n1.addNode(4);
		n1.addNode(3);
		n1.addNode(2);
		n1.addNode(1);
		System.out.println("Displaying n1");
		n1.display();
		Node3 n2 = n1.reverseRecursive();
		System.out.println("Displaying n2");
		n2.display();
	}
}
class Node3{
	int value;
	Node3 next;
	public Node3(int value) {
		this.value = value;
		this.next = null;
	}
	public void addNode(int value) {
		Node3 current = this;
		while (current.next!=null) {
			current = current.next;
		}
		current.next = new Node3(value);
	}
	public void display() {
		Node3 current = this;
		while(current!=null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	public Node3 reverse() {
		Node3 prev = null;
		Node3 curr = this;
		Node3 next = null;
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node3 head = prev;
		return head;
	}
	public Node3 reverseRecursive() {
		Node3 prev = null;
		Node3 curr = this;
		Node3 next = null;
		Node3 head = reverseRecursiveHelper(curr,prev,next);
		return head;
				
	}
	public Node3 reverseRecursiveHelper(Node3 curr,Node3 prev,Node3 next) {
		if(curr==null) {
			Node3 head = prev;
			return prev;
		}
		next = curr.next;
		curr.next = prev;
		prev = curr;
		curr = next;
		return reverseRecursiveHelper(curr, prev, next);
		
		
	}
}
