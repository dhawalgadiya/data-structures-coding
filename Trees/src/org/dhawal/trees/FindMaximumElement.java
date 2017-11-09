package org.dhawal.trees;

public class FindMaximumElement {

	public static void main(String[] args) {
		CreateTree tree1 = new CreateTree();
		TreeNode head = tree1.createTree();

		System.out.println("Maximum element in tree: " + findMaximumElement(head));
	}

	public static int findMaximumElement(TreeNode head) {
		if(head == null) {
			return Integer.MIN_VALUE;
		}
		int max = head.data;
		int a = findMaximumElement(head.left);
		int b = findMaximumElement(head.right);
		if(a > max ) max = a;
		if(b>max ) max = b;
		return max;
//		return a >= max && a >= b ? a : (b >= max && b >= a) ? b : max; 
	}

}
