package org.dhawal.trees;

public class SearchElementInBinaryTree {

	public static void main(String[] args) {
		CreateTree tree1 = new CreateTree();
		TreeNode head = tree1.createTree();
		int x = 4;
		System.out.println("element found in tree: " + findElement(head, x));
	}

	public static boolean findElement(TreeNode head, int x) {
		if(head == null)
			return false;
		if(head.data == x)
			return true;
		return findElement(head.left, x) || findElement(head.right, x);
	}

}
