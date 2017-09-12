package binarySearchTree.G4G;



/**
 * Program to find out the Lowest Common Ancestor(LCA) in a binary tree 
 * for given two values n1 & n2.
 * 
 * LCA : the lowest node in tree that has both n1 and n2 as descendants, 
 * 		 where we allow a node to be a descendant of itself.
 * 
 * Recursive solution
 * Time complexity : O(h) where h = height of tree
 * 
 * @author DEEP
 */
public class CommonAncestor {

	Node root;
	
	Node findLCA(Node root, int n1, int n2) {
		
		if(root == null)
			return null;
		
		// If both n1 and n2 are smaller than root, then LCA lies in left
		if(root.data > n1 && root.data > n2) {
			return findLCA(root.left, n1, n2);
		}
		
		// If both n1 and n2 are greater than root, then LCA lies in right
		if(root.data < n1 && root.data < n2) {
			return findLCA(root.right, n1, n2);
		}
		
		return root;
	}
	
	/* Driver program to test lca() */
    public static void main(String args[]) 
    {
        // Let us construct the BST shown in the above figure
        CommonAncestor tree = new CommonAncestor();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
  
        int n1 = 10, n2 = 14;
        Node t = tree.findLCA(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
  
        n1 = 14;
        n2 = 8;
        t = tree.findLCA(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
  
        n1 = 10;
        n2 = 22;
        t = tree.findLCA(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
  
    }
}
