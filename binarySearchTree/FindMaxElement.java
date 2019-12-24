package binarySearchTree;

import binarySearchTree.G4G.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Give an algorithm for finding maximum element n binary tree
 * <p>
 * Recursive and Iterative solution
 * <p>
 * Time complexity : O(n)
 * Space Complexity : O(n)
 *
 * @author DEEP
 */
public class FindMaxElement {

    Node root;

/****************************************************************************************************************/
    /*********** RECURSIVE SOLUTION ***********/

    int findMax(Node root) {

        int max = Integer.MIN_VALUE;
        int value = 0;
        int left, right;

        if (root != null) {
            value = root.data;
            left = findMax(root.left);
            right = findMax(root.right);

            //find largest of the three values
            if (left > right) {
                max = left;
            } else {
                max = right;
            }

            if (value > max) {
                max = value;
            }
        }
        return max;
    }


/****************************************************************************************************************/
    /*********** ITERATIVE SOLUTION ***********/

    int findMaxItr(Node root) {

        Node temp;
        int max = Integer.MIN_VALUE;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while (!q.isEmpty()) {

            temp = q.poll();
            // largest of three values
            if (max < temp.data)
                max = temp.data;
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }

        return max;
    }

    // Driver Function
    public static void main(String[] args) {

        FindMaxElement tree = new FindMaxElement();
        tree.root = new Node(7);
        tree.root.left = new Node(4);
        tree.root.right = new Node(9);
        tree.root.left.left = new Node(13);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(3);
        tree.root.right.right = new Node(11);

        System.out.println("max value in given tree : " + tree.findMaxItr(tree.root));
    }
}
