package binarySearchTree.G4G;



/**
 * Count half nodes in a Binary tree
 * Recursive Solution
 * 
 * Half node : A node which have only one child (either left or right)
 * 
 * @author DEEP
 */
public class CountHalfNodes_Recursive {

	Node root;
	
	int getHalfNodeCount(Node root) {
		
		if(root == null)
			return 0;
		
		int count = 0;
		
		if((root.left==null && root.right!=null) || (root.left!=null && root.right==null))
		{
			count++;
			System.out.print(root.data + " ");		//To Print half nodes
		}
			
		
		count += getHalfNodeCount(root.left) + getHalfNodeCount(root.right);
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
        / \  /
        1 11 4
        Let us create Binary Tree shown in
        above example */
        CountHalfNodes_Recursive tree_level = new CountHalfNodes_Recursive();
        tree_level.root = new Node(2);
        tree_level.root.left = new Node(7);
        tree_level.root.right = new Node(5);
        tree_level.root.left.right = new Node(6);
        tree_level.root.left.right.left = new Node(1);
        tree_level.root.left.right.right = new Node(11);
        tree_level.root.right.right = new Node(9);
        tree_level.root.right.right.left = new Node(4);
 
        System.out.println("\nCount of half Nodes is : " + tree_level.getHalfNodeCount(tree_level.root));
    }	
}
