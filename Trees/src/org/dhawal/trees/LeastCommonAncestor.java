package org.dhawal.trees;

public class LeastCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateTree tree1 = new CreateTree();
		TreeNode head = tree1.createTree();
		int a=1,b=4;
		TreeNode X = findLCA(head, a, b);
		
		System.out.println("LCA of "+a+" and "+b+" is : "+X.data);
	}

	static TreeNode findLCA(TreeNode root, int a, int b) {
		if(root == null || root.data == a || root.data == b) {
			return root;
		}
		TreeNode left = findLCA(root.left, a, b);
		TreeNode right = findLCA(root.right, a, b);
		if(left!= null && right!= null) {
			return root;
		}
		return (left != null ?left : right);
	}
}
