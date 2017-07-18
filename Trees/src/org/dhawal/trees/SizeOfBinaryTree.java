package org.dhawal.trees;

public class SizeOfBinaryTree {

	public static void main(String[] args) {
		CreateTree tree1 = new CreateTree();
		TreeNode head = tree1.createTree();
		System.out.println("Size of binary tree: " + sizeOfTree(head));
		System.out.println("depth of binary tree: " + depthOfTree(head));
	}

	public static int sizeOfTree(TreeNode head) {
		if(head == null)
		return 0;
		return 1 + sizeOfTree(head.left) + sizeOfTree(head.right);
	}
	
	public static int depthOfTree(TreeNode head) {
		if(head == null)
		return 0;
		int x = sizeOfTree(head.left);
		int y = sizeOfTree(head.right);
		return x > y ? x+1 : y+1;
	}
}
