package binarySearchTree.G4G;



/**
 * Program to calculate size of a binary tree
 * Recursive Solution
 * 
 * @author DEEP
 */
public class SizeOfBinaryTree {

	Node root;
	
	// method to calculate size of a tree
	int size(Node root) {
		
		if(root == null) {
			return 0;
		} else {
			return size(root.left) + 1 + size(root.right);
		}
	}	
			
	// Driver Function
	public static void main(String[] args) {
		
		SizeOfBinaryTree tree = new SizeOfBinaryTree();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("The size of binary tree is : "
                            + tree.size(tree.root));
	}
}
