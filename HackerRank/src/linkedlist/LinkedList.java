package linkedlist;

public class LinkedList {
	public static void main(String[] args) {
		Node n = new Node(5);
		n.next = new Node(7);
		n.addNode(10);
		//System.out.println(n.next.next.value);
		//System.out.println(n1.value);
		n.addNode(15);
		n.addNode(20);
		n.addNode(12);
		Node n1 = n.next.next.next.next;
		n.next.next.next.next.next.next = n1;
		//n.display();
		//n.display();
		//System.out.println(n.countNodes());
		n.isCycle();
	}
}
class Node{
	int value;
	Node next;
	public Node(int value) {
		this.value = value;
	}
	public void addNode(int value) {
		Node current = this;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = new Node(value);
	}
	public void display() {
		Node current = this;
		while(current!=null) {
			System.out.println(current.value);
			current=current.next;
		}
	}
	public int countNodes() {
		Node current = this;
		int count = 0;
		while(current!=null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void isCycle() {
		Node once = this;
		if(once.next==null) {
			return ;
		}
		Node head = this;
		Node twice = once.next;
		int flag = 0;
		nodeHelper(head,once,twice,flag);
	}
	public void nodeHelper(Node head,Node once,Node twice,int flag) {
		if(once==null) {
			System.out.println("Once was null");
			return ;
		}
		if(twice==null || twice.next==null) {
			System.out.println("Twice was null");
			return;
		}
		if(once==twice && flag==2) {
			System.out.println("Flag was 2 "+once.value);
			return;
		}
		if(flag==2) {
			nodeHelper(head, once.next, twice.next, flag);
		}
		if(once==twice) {
			once = head;
			flag = 2;
			System.out.println("In once==twice");
			nodeHelper(head,once.next,twice.next.next,flag);
		}
		if(flag ==0 ) {
			System.out.println("In flag==0");
			nodeHelper(head,once.next,twice.next.next,flag);
		}
	}
}



