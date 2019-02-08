package linkedlist;

public class AppendList {
	public static void main(String[] args) {
		Node1 a1 = new Node1(5);
		a1.addNode(2);
		a1.addNode(10);
		
		Node1 a2 = new Node1(7);
		a2.addNode(9);
		a2.addNode(15);
		System.out.println("Displaying a1");
		a1.display();
		System.out.println("Displaying a2");
		a2.display();
		System.out.println("Appending a2 at the end of a1");
		a1.appendWithoutChanging(a2);
		System.out.println("Displaying a1");
		a1.display();
		System.out.println("Displaying reverse a1");
		//a1.printReverseKNodes(2);
		
		Node1 oddEven = a1.oddEvenTogether();
		oddEven.display();
		
	}

}
class Node1{
	int value;
	Node1 next;
	static int count=0;
	public Node1(int value) {
		this.value = value;
		this.next = null;
	}
	public void addNode(int value) {
		Node1 current  = this;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = new Node1(value);
	}
	public void display() {
		Node1 current = this;
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public void append(Node1 a1) {
		Node1 current1 = this;
		Node1 current2 = a1;
		while(current1.next!=null) {
			current1 = current1.next;
		}
		current1.next = current2;
	}
	public void appendWithoutChanging(Node1 a1) {
		Node1 current1 = this;
		Node1 current2 = a1;
		while(current1.next!=null) {
			current1 = current1.next;
		}
		while(current2!=null) {
			current1.next = new Node1(current2.value);
			current1 = current1.next;
			current2 = current2.next;
		}
		
		
	}
	
	public void printReverseKNodes(int k) {
		//int count = 0;
		printReverseHelper(this,count,k);
	}
	public void printReverseHelper(Node1 head,int count,int k) {
		if(head==null) {
			return;
		}
		System.out.println("printReverseHelper("+head.value+" ,"+count+","+k+")");
		
		printReverseHelper(head.next, count, k);
		
		count++;
		if(count<=k) {
			System.out.println("count is "+count);
			System.out.println(head.value);
		}
	}
	
	public Node1 oddEvenTogether() {
		Node1 head = this;
		Node1 odd = head;
		if(odd==null) {
			return head;
		}
		if(odd.next ==null) {
			return head;
		}
		
		Node1 even = head.next;
		Node1 evenFirst = even;
		while(true) {
			if(even==null||odd==null||even.next==null)
			{
				odd.next = evenFirst;
				break;
			}
			odd.next = even.next;
			odd = odd.next;
			if(odd.next==null) {
				even.next=null;
				odd.next = evenFirst;
				
				break;
			}
			even.next = odd.next;
			even = even.next;
			
			
		}
		
		
		return head;
		
		
		
		
		
	}
	
	
	
}
