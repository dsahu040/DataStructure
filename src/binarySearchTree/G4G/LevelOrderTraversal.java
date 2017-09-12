package binarySearchTree.G4G;



/**
 * Recursive Java program for level order traversal of Binary Tree
 *
 * @author DEEP
 */
public class LevelOrderTraversal {

	Node root;
	
	public LevelOrderTraversal() {
		root = null;
	}
	
	/* function to print level order traversal of tree*/
	void printLevelOrder() {
		int h = height(root);
		int i;
		for(i=1; i<=h; i++) {
			printGivenLevel(root, i);
		}
	}
	
	/* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
	int height(Node root) {
		if(root == null) {
			return 0;
		} else {
			/* compute  height of each subtree */
			int lHeight = height(root.left);
			int rHeight = height(root.right);
			
			/* use the larger one */
			if(lHeight > rHeight)
				return (lHeight + 1);
			else return (rHeight + 1);
		}
	}
	
	/* Print nodes at the given level */
	void printGivenLevel(Node root, int level) {
		if(root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printGivenLevel(root.left, level-1);
			printGivenLevel(root.right, level-1);
		}
	}
	
	//Driver method
	public static void main(String[] args) {

		LevelOrderTraversal tree = new LevelOrderTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Level order traversal of binary tree is : ");
		tree.printLevelOrder();
	}

}
