package binarySearchTree.G4G;



/**
 * Reverse level order tree traversal 
 * 
 * Recursive Solution
 * 
 * @author DEEP
 */
public class ReverseLevelOrder_Recursive {

	Node root;
	
	void reverseLevelOrder(Node node) {
		
		int h = height(node);
		int i;
		
		for(i=h; i>=1; i--) {
			printGivenLevel(node, i);
		}		
	}
	
	void printGivenLevel(Node node, int level) {
		
		if(node == null)
			return;
		if(level == 1)
			System.out.print(node.data + " ");
		else if(level > 1) {
			printGivenLevel(node.left, level-1);
			printGivenLevel(node.right, level-1);
		}
	}
	
	int height(Node node) {
		if(node == null)
			return 0;
		else {
			int lHeight = height(node.left);
			int rHeight = height(node.left);
			
			if(lHeight > rHeight)
				return (lHeight + 1);
			else 
				return (rHeight + 1);
		}
	}
	
	// driver method 
	public static void main(String args[]) 
    {
        ReverseLevelOrder_Recursive tree = new ReverseLevelOrder_Recursive();
  
        // Let us create trees shown in above diagram
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
          
        System.out.println("Level Order traversal of binary tree is : ");
        tree.reverseLevelOrder(tree.root);
    }
}
