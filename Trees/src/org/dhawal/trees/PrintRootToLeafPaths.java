package org.dhawal.trees;

public class PrintRootToLeafPaths {

	public static void main(String[] args) {
		CreateTree tree1 = new CreateTree();
		TreeNode root = tree1.createTree();
		System.out.println("Tree's root to leaf paths are: ");
		int path[] = new int[15];
		printAllPaths(root, path, 0);

	}

	public static void printAllPaths(TreeNode root, int []path, int len) {
		if(root == null)
			return;
		path[len] = root.data;
		if(root.left == null && root.right == null) {
			printArray(path, len);
		}
		printAllPaths(root.left, path, len +1);
		printAllPaths(root.right, path, len +1);
		
	}
	
	public static void printArray(int path[], int len) {
		for(int i=0; i<len; i++) {
			System.out.print(path[i]+"->");
		}
		System.out.println();
	}
}
