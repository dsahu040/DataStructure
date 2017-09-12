package binarySearchTree.G4G;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Program to search a key data in a given binary tree
 * using level order traversal
 * 
 * @author DEEP
 */
public class SearchDataInBinaryTree {

	Node root;
	
	boolean iterativeSearch(Node root, int x) {
		
		if(root == null)
			return false;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node node = q.poll();
			if(node.data == x){
				return true;
			}
			
			if(node.left != null)
				q.add(node.left);
			if(node.right != null)
				q.add(node.right);
		}
		return false;
	}
	
	// Driver Function
	public static void main(String[] args) {
		
		SearchDataInBinaryTree tree = new SearchDataInBinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println(tree.iterativeSearch(tree.root, 17));
	}
}
