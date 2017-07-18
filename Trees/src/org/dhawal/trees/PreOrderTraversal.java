package org.dhawal.trees;

import java.util.Stack;

public class PreOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree tree1 = new CreateTree();
		TreeNode head = tree1.createTree();

		System.out.println("Pre Order Traversal");
		preOrderWithRecursion(head);
		System.out.println("\nPre Order Traversal without recursion");
		nonRecursion(head);
	}
	
	public static void nonRecursion(TreeNode head) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		if(head == null) {
			
		}
		do {
			while(head != null) {
				System.out.print(" "+head.data);
				stack.push(head);
				head = head.left;
			}
			if(head == null) {
				if(stack.isEmpty()) break;
			head = stack.pop();
			head = head.right;
			}
		}while(true);
			
	}
	
	public static void preOrderWithRecursion(TreeNode head) {
		if(head == null) {
			return;
		}
		System.out.print(" "+head.data);
		preOrderWithRecursion(head.left);
		preOrderWithRecursion(head.right);
	}

}
