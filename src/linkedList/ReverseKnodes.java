package linkedList;

/**
 * for a given K value (K>0) reverse block of K nodes in a list.
 * 
 * @author DEEP
 *
 */
public class ReverseKnodes {

	public LinkedListIntersection a;
	
	void create(int n) {
		a = new LinkedListIntersection();
		for(int i=1; i<=n; i++) {
			a.addAtEnd(i);
		}
		a.display();
	}
	
	private Node reverse(Node head, int k) {
		
		Node current = head;
		Node next = null;
		Node prev = null;
		
		int count = 0;
		
		// reverse first k nodes of the linked list
		while(count<k && current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		
		if(next!=null) {
			head.next = reverse(next, k);
		}
		
		//prev is now head of  input list
		return prev;
	}
	
	public static void main(String[] args) {

		ReverseKnodes knodes = new ReverseKnodes();
		knodes.create(7);
		
		Node n = knodes.reverse(knodes.a.head, 3);
		while(n!=null){
			System.out.println(" -> " + n.data);
			n = n.next;
		}
	}

}
