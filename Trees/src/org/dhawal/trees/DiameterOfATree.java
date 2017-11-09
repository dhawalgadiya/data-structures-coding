package org.dhawal.trees;

public class DiameterOfATree {
	static int diameter = 0;
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		CreateTree tree1 = new CreateTree();
		TreeNode head = tree1.createTree(arr);
//		DiameterOfTree(head);
//		System.out.println("Diameter = "+diameter);
		
		TreeNode diameterX = new TreeNode(0);
//		DiameterOfTreeWithStaticParam(head, diameterX);
//		System.out.println("Diameter = "+diameterX.data);
		
		int result[] = DiameterOfTreeWithReuslt(head);
		System.out.println("Diameter from Result = "+result[1]);
	}
	
	public static int DiameterOfTree(TreeNode root) {
		if(root == null)
			return 0;
		int L = DiameterOfTree(root.left);
		int R = DiameterOfTree(root.right);
		int D = L+R+1;
		if(D>diameter){
			diameter = D;
		}
		return L>R ? (L+1) : (R+1);
	}
	
	public static int DiameterOfTreeWithStaticParam(TreeNode root, TreeNode diameter) {
		if(root == null)
			return 0;
		int L = DiameterOfTree(root.left);
		int R = DiameterOfTree(root.right);
		int D = L+R+1;
		if(D>diameter.data){
			diameter.data = D;
		}
		return L>R ? (L+1) : (R+1);
	}
	// Array represent height, and diameter
	public static int[] DiameterOfTreeWithReuslt(TreeNode root) {
		if(root == null)
			return new int[]{0,0};
		int result[] = new int[2];
		int L[] = DiameterOfTreeWithReuslt(root.left);
		int R[] = DiameterOfTreeWithReuslt(root.right);
		int D = L[0]+R[0]+1;
		
		result[1] = Math.max(D, Math.max(L[1], R[1]));
		result[0] = L[0]>R[0] ? (L[0]+1) : (R[0]+1);
		return result;
	}
}
