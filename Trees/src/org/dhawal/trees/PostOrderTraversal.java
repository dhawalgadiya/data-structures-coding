package org.dhawal.trees;

import java.util.Stack;

public class PostOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree tree1 = new CreateTree();
		TreeNode head = tree1.createTree();

		System.out.println("Pre Order Traversal");
		postOrderWithRecursion(head);
		System.out.println("\nPre Order Traversal without recursion");
		nonRecursion(head);

	}

	public static void postOrderWithRecursion(TreeNode head) {
		if(head == null) {
			return;
		}
		postOrderWithRecursion(head.left);
		postOrderWithRecursion(head.right);
		System.out.print(" "+head.data);
		
	}

	public static void nonRecursion(TreeNode head) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		do{
			while(head != null) {
				stack.push(head);
				head = head.left;
			}
			if(stack.isEmpty()) {
				break;
			}
			if(head == null) {
				head = stack.pop();
				System.out.print(" "+head.data);					
				while(!stack.isEmpty() && head == stack.peek().right) {
					head = stack.pop();
					System.out.print(" "+head.data);
				}	
				if(!stack.isEmpty()) {
					head = (stack.peek().right);
				}
				else head = null;

			}
		}while(true);
	}

}
