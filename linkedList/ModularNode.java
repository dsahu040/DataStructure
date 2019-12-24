package linkedList;

/**
 * Given a singly Linked list, write a function to find the last element from the beginning
 * whose n%k==0, where n is the number of elements in the list and k is an integer constant. 
 * 
 * @author DEEP
 *
 */
public class ModularNode {

	public LinkedListIntersection a;
	
	// to create linked list
	private void create(int n) {
		a = new LinkedListIntersection();
		
		for(int i=1; i<=n; i++) {
			a.addAtEnd(i);
		}
		a.display();
	}
	
	// find modular node
	private Node modularNodes(Node head, int k) {
		
		Node modularNode = new Node(0);
		int i=0;
		
		if(k<=0) {
			return null;
		}
		
		for(i=1; head!=null; head=head.next){
			if(i%k==0){
				modularNode = head;
			}
			i++;
		}
		return modularNode;
	}
	
	public static void main(String[] args) {

		ModularNode node = new ModularNode();
		node.create(19);
		
		Node n = node.modularNodes(node.a.head, 4);
		System.out.println("modular node : " + n.data);
	}

}
