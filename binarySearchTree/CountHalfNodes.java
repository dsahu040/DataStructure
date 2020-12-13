package binarySearchTree.G4G;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Count half nodes in a Binary tree
 * Non-Recursive Solution
 * 
 * Half node : A node which have only one child (either left or right)
 * 
 * @author DEEP
 */
public class CountHalfNodes {

	Node root;
	
	int getHalfNodeCount() {
		
		if(root == null)
			return 0;
		
		// Do level order traversal starting from root
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		int count = 0; // Initialize countof half node
		
		while(!queue.isEmpty()) {
			
			Node temp = queue.poll();
			
			if(temp.left==null && temp.right!=null || temp.left!=null && temp.right==null)
				count++;
			if(temp.left!=null)
				queue.add(temp.left);
			if(temp.right!=null)
				queue.add(temp.right);
		}
		return count;
	}
	
	// Driver method
	public static void main(String args[])
    {
        /* 2
          / \
        7    5
        \    \
        6    9
        / \ /
        1 11 4
        Let us create Binary Tree shown in
        above example */
        CountHalfNodes tree_level = new CountHalfNodes();
        tree_level.root = new Node(2);
        tree_level.root.left = new Node(7);
        tree_level.root.right = new Node(5);
        tree_level.root.left.right = new Node(6);
        tree_level.root.left.right.left = new Node(1);
        tree_level.root.left.right.right = new Node(11);
        tree_level.root.right.right = new Node(9);
        tree_level.root.right.right.left = new Node(4);
 
        System.out.println(tree_level.getHalfNodeCount());
    }
}
