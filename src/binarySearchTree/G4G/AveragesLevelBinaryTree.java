package binarySearchTree.G4G;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Program to print the average value of the nodes on each level.
 * 
 * using level order traversal
 * 
 * @author DEEP
 */
public class AveragesLevelBinaryTree {

	Node root;
	
	//method to find out average
	List<Double> averageOflevels(Node root) {
		
		List<Double> list = new ArrayList<Double>();
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			
			long sum = 0;
			int count = 0;
			Queue<Node> temp = new LinkedList<Node>();
			
			while(!q.isEmpty()) {
				Node n = q.remove();
				sum += n.data;
				count++;
				
				if(n.left != null)
					temp.add(n.left);
				if(n.right != null)
					temp.add(n.right);
			}
			q = temp;
			list.add(sum*1.0/count);
		}
		return list;
	}
	
	// Driver Function
	public static void main(String[] args) {
		
		AveragesLevelBinaryTree tree = new AveragesLevelBinaryTree();
		 tree.root = new Node(4);
         tree.root.left = new Node(2);
	     tree.root.right = new Node(9);	
	     tree.root.left.left = new Node(3);
         tree.root.left.right = new Node(5);
	     tree.root.left.right.right = new Node(7);
	     
	     List<Double> list = tree.averageOflevels(tree.root);
	     
	     for(Double d : list) {
	    	 System.out.println(d.toString());
	     }
	}
	
	
}
