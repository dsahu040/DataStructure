package binarySearchTree.G4G;

import java.util.Stack;

/**
 * Inorder tree traversal without using recursion
 * Using Stack
 *  
 * @author DEEP
 *
 */
public class InorderTraversal {

	Node root;
	
	void inOrder() {
		if(root == null) {
			return;
		}
		
		//keep the nodes in the path that are waiting to be visited
		Stack<Node> stack = new Stack<Node>();
		Node node = root;
		
		//first node to be visited will be the left one
		while(node != null) {
			stack.push(node);
			node = node.left;
		}
		
		while(stack.size() > 0) {
			
			//visit the top node
			node = stack.pop();
			System.out.print(node.data + " ");
			if(node.right != null){
				node = node.right;
				
				while(node != null){
					stack.push(node);
					node = node.left;
				}
			}
		}
	}
	
	//Driver method
	 public static void main(String args[]) {
         
	        /* creating a binary tree and entering 
	         the nodes */
	        InorderTraversal tree = new InorderTraversal();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.inOrder();
	    }
}
