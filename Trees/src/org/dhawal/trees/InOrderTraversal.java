package org.dhawal.trees;

import java.util.Stack;

public class InOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree tree1 = new CreateTree();
		TreeNode head = tree1.createTree();

		System.out.println("In Order Traversal");
		InOrderWithRecursion(head);
		System.out.println("\nIn Order Traversal without recursion");
		nonRecursion(head);
	}
	
	public static void InOrderWithRecursion(TreeNode head) {
		if(head == null) {
			return;
		}	
		InOrderWithRecursion(head.left);
		System.out.print(" "+head.data);
		InOrderWithRecursion(head.right);
	}

	private static void nonRecursion(TreeNode head) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		do {
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
				head = head.right;
			}
		}while(true);
		
	}

}
