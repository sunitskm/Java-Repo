package trees;

import java.util.*;

public class IterativeTree {
	public static void main(String[] args) {
		Tree2 t = new Tree2(1);
		t.left = new Tree2(0);
		t.right = new Tree2(2);
		t.right.left = new Tree2(3);
		System.out.println("Preorder Traversal "+Tree2.preOrderTraversal(t));
		System.out.println("Inorder Traversal "+Tree2.inOrderTraversal(t));
		System.out.println("Postorder Traversal "+Tree2.postOrderTraversal(t));
		System.out.println("Levelorder Traversal "+Tree2.levelOrderTraversal(t));
	}
}

class Tree2{
	int val;
	Tree2 right;
	Tree2 left;
	
	Tree2(int val){
		this.val = val;
		this.left=null;
		this.right=null;
	}
	
	public static List<Integer> preOrderTraversal(Tree2 root){
		Stack<Tree2> s = new Stack<Tree2>();
		List<Integer> li = new ArrayList<Integer>();
		s.add(root);
		while(!s.isEmpty()) {
			Tree2 node = s.pop();
			li.add(node.val);
			if(node.right!=null) {
				s.add(node.right);
			}
			if(node.left!=null) {
				s.add(node.left);
			}
		}
		
		return li;
	}
	public static List<Integer> inOrderTraversal(Tree2 root){
		List<Integer> li = new ArrayList<Integer>();
		Stack<Tree2> stack = new Stack<Tree2>();
		Tree2 current = root;
		while(!stack.isEmpty() || current!=null) {
			while(current!=null) {
				stack.add(current);
				current = current.left;
			}
			Tree2 node = stack.pop();
			li.add(node.val);
		    current = node.right;
		}
		return li;
	}
	
	
	public static List<Integer> postOrderTraversal(Tree2 root){
		List<Integer> li = new ArrayList<Integer>();
		postTraverse(root,li);
		return li;
	}
	public static void postTraverse(Tree2 current,List<Integer> li) {
		if(current == null) {
			return;
		}
		postTraverse(current.left, li);
		postTraverse(current.right, li);
		li.add(current.val);
	}
	
	public static List<Integer> levelOrderTraversal(Tree2 root){
		Queue<Tree2> queue = new LinkedList<Tree2>();
		List<Integer> li = new ArrayList<Integer>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Tree2 node = queue.poll();
			li.add(node.val);
			if(node.left!=null) {
				queue.add(node.left);
			}
			if(node.right!=null) {
				queue.add(node.right);
			}
		}
		return li;
	}
	
}
