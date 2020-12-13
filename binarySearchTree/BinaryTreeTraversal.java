package binarySearchTree.G4G;



/**
 * Java program for different tree traversals
 * 
 * @author DEEP
 */
public class BinaryTreeTraversal {

	Node root;
	
	BinaryTreeTraversal(){
		root = null;
	}
	
	/* Given a binary tree, print its nodes according to the
    "bottom-up" postorder traversal. */
	void printPostOrder(Node node) {
		if(node == null)
			return;
		//first recur on left subtree
		printPostOrder(node.left);
		
		//then recur on right subtree
		printPostOrder(node.right);
		
		//now deal with the node
		System.out.print(node.data + " ");
	}
	
	/* Given a binary tree, print its nodes in inorder*/
	void printInorder(Node node) {
		if(node == null)
			return;
		
		//first recur on left subtree
		printInorder(node.left);
		
		//then print the data of node
		System.out.print(node.data + " ");
		
		//now recur on right node
		printInorder(node.right);
	}
	
	/* Given a binary tree, print its nodes in preorder*/
	void printPreorder(Node node) {
		if(node == null)
			return;
		
		//first print the data of node
		System.out.print(node.data + " ");
		
		//then recur on left node
		printPreorder(node.left);
		
		//now recur on right subtree
		printPreorder(node.right);
	}
	
	
	//wrappers over recursive functions
	void printPostorder() { printPostOrder(root); }
	void printInorder() { printInorder(root); }
	void printPreorder() { printPreorder(root); }
	
	//Driver method
	public static void main(String[] args) {
		BinaryTreeTraversal tree = new BinaryTreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();
 
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();
 
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
	}
}
