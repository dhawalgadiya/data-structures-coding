package org.dhawal.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		CreateTree tree1 = new CreateTree();
		TreeNode head = tree1.createTree();

		System.out.println("Level Order Traversal");
		LevelOrderWithRecursion(head);

	}

	public static void LevelOrderWithRecursion(TreeNode head) {
		Queue<TreeNode> queue= new LinkedList<TreeNode>();
		queue.add(head);
		do {
			if(queue.isEmpty())
				break;
			head = queue.remove();
			System.out.print(" "+head.data);
			if(head.left != null) queue.add(head.left);
			if(head.right != null) queue.add(head.right);
		}while(true);
	}

}
