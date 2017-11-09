package org.dhawal.trees;

/**
 * http://www.geeksforgeeks.org/print-nodes-distance-k-given-node-binary-tree/
 * @author dgadiya
 *
 */
public class PrinntNodesFromKDistance {

	public static void main(String[] args) {

		CreateTree tree1 = new CreateTree();
		TreeNode head = tree1.createTree();
		int target = 6, k=4;
		
		System.out.println(k+" distance nodes of tree from "+target+" are ");
		
		findKDistanceNodes(head, target, k);
		
		
	}
	
	static int findKDistanceNodes(TreeNode root, int target, int k) {
		if(root == null) {
			return -1;
		}
		// When the root node is target node, find all the k distance node in the 
		// subtree by calling the below method 
		if(root.data == target){
			findKDistanceNodesInSubTree(root,k);
			// Return 1 to the ancestor/parent node to indicate that the target node was found at distance 1. 
			return 1;
		}
		// 
		int distanceOfTargetFromRootInLeftTree = findKDistanceNodes(root.left, target, k);
		// The root is at k distance from target
		if(distanceOfTargetFromRootInLeftTree == k) {
			System.out.print(root.data+" ");
			
		}
		// Find the k distance nodes in right sub tree
		else if(distanceOfTargetFromRootInLeftTree > 0 ) {
			findKDistanceNodesInSubTree(root.right, k-distanceOfTargetFromRootInLeftTree-1);
			// Return +1 to the ancestor/parent node to indicate that the target node was found at this distance 
			return distanceOfTargetFromRootInLeftTree+1;
		}
		
		
		
		int distanceOfTargetFromRootInRightTree = findKDistanceNodes(root.right, target, k);
		// The root is at k distance from target
		if(distanceOfTargetFromRootInRightTree == k) {
			System.out.print(root.data+" ");
			
		}
		// Find the k distance nodes in left sub tree
		else if(distanceOfTargetFromRootInRightTree > 0 ) {
			findKDistanceNodesInSubTree(root.left, k-distanceOfTargetFromRootInRightTree-1);
			return distanceOfTargetFromRootInRightTree+1;
		}
		
		return -1;
	}
	
	static void findKDistanceNodesInSubTree(TreeNode root, int k) {
		if(root == null) {
			return;
		}
		if(k == 0) {
			System.out.print(root.data+" ");
			return;
		}
		findKDistanceNodesInSubTree(root.left, k-1);
		findKDistanceNodesInSubTree(root.right, k-1);
	}
}
