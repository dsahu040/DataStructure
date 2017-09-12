package binarySearchTree.G4G;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Find out the height of a binary tree
 * 
 * @author DEEP
 */
public class HeightOfBinaryTree {

	Node root;
/*****************************************************************************************************/
	/************* RECURSIVE SOLUTION *************/
	/* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
	int height(Node root) {
		if(root == null) {
			return 0;
		} else {
			/* compute  height of each subtree */
			int lHeight = height(root.left);
			int rHeight = height(root.right);
			
			/* use the larger one */
			if(lHeight > rHeight)
				return (lHeight + 1);
			else return (rHeight + 1);
		}
	}

/*****************************************************************************************************/
	/************* ITERATIVE SOLUTION *************/
	
	int heightItr(Node root) {
		if(root == null)
			return 0;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int height = 0;
		
		while(1==1) {
			// nodeCount (queue size) indicates number of nodes at current level.
			int nodeCount = q.size();
			if(nodeCount == 0) {
				return height;
			}
			
			height++;
			
			// Dequeue all nodes of current level and Enqueue all nodes of next level
			while(nodeCount > 0) {
				Node newNode = q.peek();
				q.remove();
				if(newNode.left != null)
					q.add(newNode.left);
				if(newNode.right != null)
					q.add(newNode.right);
				
				nodeCount--;
			}
		}
	}
	
	
	
	// Driver program to test above functions
    public static void main(String args[]) 
    {
        HeightOfBinaryTree tree = new HeightOfBinaryTree();
        
        // Let us create a binary tree shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Height of tree is " + tree.heightItr(tree.root));
    }
}
