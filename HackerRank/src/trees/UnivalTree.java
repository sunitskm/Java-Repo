package trees;

public class UnivalTree {
	public static void main(String[] args) {
		Tree t = new Tree(15);
		t.insert(15);
		t.insert(15);
		System.out.println(t.containsValue(t, 25));
		t.inOrderTraversal();
		System.out.println(t.isUnival(t));
		System.out.println(t.countUnival(t,0));
	}
}
class Tree{
	int value;
	Tree left;
	Tree right;
	public Tree(int value) {
		this.value = value;
		left = null;
		right = null;
	}
	public void insert(int value) {
		Tree root = this;
		insertHelper(value, root);
	}
	public void insertHelper(int value, Tree root) {
		if(value>root.value) {
			if(root.right!=null) {
				insertHelper(value, root.right);
			}
			else {
				root.right = new Tree(value);
			}
			
		}
		else {
			if(root.left!=null) {
				insertHelper(value, root.left);
			}
			else {
				root.left = new Tree(value);
			}
		}
	}
	public boolean containsValue(Tree root, int value) {
		if(root.value==value) {
			return true;
		}
		if(root.value>value) {
			if(root.left==null) {
				return false;
			}
			else {
				return containsValue(root.left, value);
			}
		}
		if(root.value<value) {
			if(root.right==null) {
				return false;
			}
			else {
				return containsValue(root.right, value);
			}
		}
		return false;
	}
	public void inOrderTraversal() {
		if(this.left!=null) {
			this.left.inOrderTraversal();
		}
		System.out.println(this.value);
		if(this.right!=null)
			this.right.inOrderTraversal();
	}
	
	public boolean isUnival(Tree root) {
		if(root==null) {
			return true;
		}
		int value = root.value;
		if(root.left!=null && root.left.value!=value) {
			return false;
		}
		if(root.right!=null && root.right.value!=value) {
			return false;
		}
		return (isUnival(root.left)&&isUnival(root.right));
		
		
	}
	public int countUnival(Tree root,int count) {
		if(root==null) {
			return 0;
		}
		
			count = count+countUnival(root.left,count)+countUnival(root.right,count);
		
		
		if(isUnival(root)) {
			count++;
		}
		return count;
	}
	
	
}
