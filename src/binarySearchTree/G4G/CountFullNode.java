package binarySearchTree.G4G;



/**
 * Count full nodes in a Binary tree
 * Recursive Solution
 * 
 * Full node : A node which have both left and right child nodes
 * 
 * @author DEEP
 */
public class CountFullNode {

	Node root;
	
	int getFullNodeCount(Node node) {
		
		if(node == null)
			return 0;
		
		int count = 0;
		
		if(node.left!=null && node.right!=null) {
			count++;
			System.out.print(node.data + " ");
		}
		
		count += getFullNodeCount(node.left) + getFullNodeCount(node.right);
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
		        CountFullNode tree_level = new CountFullNode();
		        tree_level.root = new Node(2);
		        tree_level.root.left = new Node(7);
		        tree_level.root.right = new Node(5);
		        tree_level.root.left.right = new Node(6);
		        tree_level.root.left.right.left = new Node(1);
		        tree_level.root.left.right.right = new Node(11);
		        tree_level.root.right.right = new Node(9);
		        tree_level.root.right.right.left = new Node(4);
		 
		        System.out.println("\nnumber of Full nodes is :" + tree_level.getFullNodeCount(tree_level.root));
		    }	
}
