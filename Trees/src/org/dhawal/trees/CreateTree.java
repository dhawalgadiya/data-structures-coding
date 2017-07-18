package org.dhawal.trees;

import java.util.LinkedList;
import java.util.Queue;

public class CreateTree {
	
	public TreeNode createTree() {
		int arr[] = {1,2,3,4,5,6,7};	//{5,7,8,9,2,23,1};
		return createTree(arr);
	}
	public TreeNode createTree(int arr[]) {
		
		TreeNode head = new TreeNode(arr[0]);
		TreeNode node = head;
		Queue<TreeNode> treeQueue = new LinkedList<>();
		treeQueue.add(node);
		TreeNode currentNode = treeQueue.poll();
		for(int i=1; i< arr.length; i++) {
			TreeNode newNode = new TreeNode(arr[i]);
			if(currentNode.left == null) {
				currentNode.left = newNode;
				treeQueue.add(newNode);
			}
			else if(currentNode.right == null) {
				currentNode.right = newNode;
				treeQueue.add(newNode);
				currentNode = treeQueue.remove();
			}
		}
		return head;
	}
	
	public static void getPreOrderTraversalprintTree(TreeNode head) {
		
	}
}
