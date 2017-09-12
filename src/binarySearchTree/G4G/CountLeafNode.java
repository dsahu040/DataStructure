package binarySearchTree.G4G;



/**
 * Count leaf nodes in a Binary tree
 * Recursive Solution
 * 
 * Leaf node : A node which have no child node
 * 
 * @author DEEP
 */
public class CountLeafNode {

	Node root;
	
	int getLeafNodeCount(Node node) {
		
		if(node == null)
			return 0;
		
		int count = 0;
		
		if(node.left==null && node.right==null)
		{
			count++;
			System.out.print(node.data + " ");		//To Print leaf nodes
		}
			
		count += getLeafNodeCount(node.left) + getLeafNodeCount(node.right);
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
	        CountLeafNode tree_level = new CountLeafNode();
	        tree_level.root = new Node(2);
	        tree_level.root.left = new Node(7);
	        tree_level.root.right = new Node(5);
	        tree_level.root.left.right = new Node(6);
	        tree_level.root.left.right.left = new Node(1);
	        tree_level.root.left.right.right = new Node(11);
	        tree_level.root.right.right = new Node(9);
	        tree_level.root.right.right.left = new Node(4);
	 
	        System.out.println("\nnumber of leaf nodes is :" + tree_level.getLeafNodeCount(tree_level.root));
	    }	
}
