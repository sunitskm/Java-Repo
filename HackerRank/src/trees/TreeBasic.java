package trees;

public class TreeBasic {
	public static void main(String[] args) {
		Tree1 t = new Tree1(20);
		t.insertElement(10);
		t.insertElement(5);
		t.insertElement(15);
		t.insertElement(25);
		t.insertElement(22);
		t.insertElement(21);
		t.insertElement(27);
		t.inOrderTraversal();
		System.out.println(t.containsValue(21));
	}
}
class Tree1{
	private Tree1 left;
	private Tree1 right;
	private int value;
	public Tree1(int value) {
		this.value = value;
	}
	
	public void insertElement(int value) {
		if(this.value>value) {
			if(this.left==null) {
				this.left = new Tree1(value);
			}
			else {
				this.left.insertElement(value);
			}
		}
		else {
			if(this.right==null) {
				this.right = new Tree1(value);
			}
			else {
				this.right.insertElement(value);
			}
		}
	}
	
	public boolean containsValue(int value) {
		
		if(this.value==value) {
			return true;
		}
		else if(this.value>value) {
			if(this.left==null) {
				return false;
			}
			return this.left.containsValue(value);
		}
		else {
			if(this.right==null) {
				return false;
			}
			return this.right.containsValue(value);
		}
	}
	
	public void inOrderTraversal() {
		if(this.left!=null) {
			this.left.inOrderTraversal();
		}
		System.out.println(this.value);
		if(this.right!=null) {
			this.right.inOrderTraversal();
		}
	}
	
}







