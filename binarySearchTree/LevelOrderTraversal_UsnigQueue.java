package binarySearchTree.G4G;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Iterative Queue based Java program to do level order traversal of Binary Tree
 * 
 * @author DEEP
 */
public class LevelOrderTraversal_UsnigQueue {

	Node root;
	
	/* Given a binary tree. Print its nodes in level order
    using array for implementing queue  */
	void printLevelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			/* poll() removes the present head. */
			Node tempNode = queue.poll();
			System.out.print(tempNode.data + " ");
			
			/*Enqueue left child */
			if(tempNode.left != null){
				queue.add(tempNode.left);
			}
			
			/*Enqueue right child */
			if(tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}
	
	/* Driver method */
	public static void main(String[] args) {

		LevelOrderTraversal_UsnigQueue tree = new LevelOrderTraversal_UsnigQueue();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Level order traversal of binary tree is : ");
		tree.printLevelOrder();
	}

}
