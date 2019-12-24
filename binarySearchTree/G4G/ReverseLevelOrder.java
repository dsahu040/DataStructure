package binarySearchTree.G4G;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Reverse level order tree traversal 
 * Non-recursive
 * Using Queue and Stack data structure
 * 
 * @author DEEP
 */
public class ReverseLevelOrder {

	Node root;
	
	void reverseLevelOrder(Node node) {
		
		Stack<Node> stack = new Stack<Node>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		
		/*Do something like normal level order traversal order.
		 * Following are the differences with normal level order traversal
		 * 1) Instead of printing a node, we push the node to stack
		 * 2) Right subtree is visited before left subtree		
		 */
		while (queue.isEmpty()== false) {
			
			// Dequeue node and make it root
			node = queue.peek();
			queue.remove();
			stack.add(node);
			
			// Enqueue right child 
			if(node.right != null){
				queue.add(node.right);
			}
			
			// Enqueue left child after right child
			if(node.left != null){
				queue.add(node.left);
			}
		}
		
		// Pop all items from stack and print.
		while(stack.empty() == false) {
			node = stack.peek();
			System.out.print(node.data + " ");
			stack.pop();
		}
	}
	
	// Driver program to test above functions
    public static void main(String args[]) 
    {
        ReverseLevelOrder tree = new ReverseLevelOrder();
  
        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
  
        System.out.println("Level Order traversal of binary tree is :");
        tree.reverseLevelOrder(tree.root);
  
    }
}
