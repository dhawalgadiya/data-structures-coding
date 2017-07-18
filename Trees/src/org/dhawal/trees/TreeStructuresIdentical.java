package org.dhawal.trees;

public class TreeStructuresIdentical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateTree tree1 = new CreateTree();
		TreeNode root1 = tree1.createTree();
		TreeNode root2 = tree1.createTree();
		TreeNode root3 = tree1.createTree(new int[]{1,2,3,4,5,6,8});
		
		System.out.println("Trees Identical is: " + checkIfIdenticalTrees(root1,root3));
		System.out.println("Trees Identical is: " + checkIfIdenticalTrees(root1,root2));
	}

	public static boolean checkIfIdenticalTrees(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 == null)
			return true;
		if(root1 == null || root2 == null)
			return false;
		return root1.data == root2.data && checkIfIdenticalTrees(root1.left, root2.left) &&
				checkIfIdenticalTrees(root1.right, root2.right);
	}

}
