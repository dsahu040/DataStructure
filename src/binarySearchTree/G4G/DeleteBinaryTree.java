package binarySearchTree.G4G;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Delete all the nodes of a Binary tree
 * 
 * @author DEEP
 */
public class DeleteBinaryTree {

	Node root;
/******************************************************************************************************************/
	/********** RECURSIVE SOLUTION **********/
	 /*  This function traverses tree in post order to 
    to delete each and every node of the tree */
	void deleteTree(Node node) {
		
		if(node == null) {
			return;
		}
		
		/* first delete both subtrees */
		deleteTree(node.left);
		deleteTree(node.right);
		
		/* then delete the node */
		System.out.println("The deleted node is : " + node.data);
		node = null;
	}
	
/******************************************************************************************************************/
	/********** ITERATIVE SOLUTION **********/
	
	void _deleteTree() {
		
		if(root == null) {
			return;
		}
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node n = q.poll();
			System.out.println("The deleted node is : " + n.data);
			
			if(n.left != null)
				q.add(n.left);
			if(n.right != null)
				q.add(n.right);
		} 	
	}
	
	void deleteTree(){
		_deleteTree();
		root = null;
	}
	
	
	// Driver program to test above functions
    public static void main(String[] args) 
    {
        // create a binary tree
        DeleteBinaryTree tree = new DeleteBinaryTree();
        tree.root = new Node(15);
        tree.root.left = new Node(10);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(16);
        tree.root.right.right = new Node(25);
 
        // delete entire binary tree
        tree.deleteTree();
    }
}
