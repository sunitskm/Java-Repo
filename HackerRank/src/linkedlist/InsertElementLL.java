                                                                                package linkedlist;

public class InsertElementLL {
	public static void main(String[] args) {
		Node4 n = new Node4(4);
		n.addNode(5);
		n.addNode(2);
		n.addNode(6);
		n.addNode(1);
		n.addNode(8);
		n.addNode(12);
		System.out.println("Displaying the linked list");
		n.display();
		Node4 n2 = n.insert(25);
		System.out.println("Displaying linked list after insertion");
		n2.display();
		n2 = n.insert(20,1);
		System.out.println("Displaying linked list after insertion at a particular position");
		n2.display();
		
	}
}

class Node4{
	int value;
	Node4 next;
	public Node4(int value) {
		this.value = value;
		this.next = null;
	}
	public void addNode(int value) {
		Node4 current = this;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = new Node4(value);
	}
	public void display() {
		Node4 current=this;
		while(current!=null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public Node4 insert(int value) {
		Node4 n2 = new Node4(value);
		n2.next = this;
		return n2;
	}
	public Node4 insert(int value,int position) {
		Node4 head = this;
		Node4 current = this;
		
		Node4 newNode = new Node4(value);
		if(position==1) {
			newNode.next = current;
			//current.next = newNode;
			return newNode;
		}
		while(position!=2) {
			
			position--;
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
		return head;
	}
}
