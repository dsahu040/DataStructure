package linkedList;

/**
 * Reverse linked list elements in pair.
 * @author DEEP
 *
 */
public class ReversePairInLL {

	public LinkedListIntersection a;
	
	private void create() {
	
		a = new LinkedListIntersection();
		a.addAtEnd(2);
		a.addAtEnd(17);
		a.addAtEnd(5);
		a.addAtEnd(84);
		a.addAtEnd(46);
		a.addAtEnd(26);
		a.addAtEnd(13);
		a.display();
	}
	
	// Recursive solution
	private Node reversePairRecursive(Node head) {
		
		Node temp;
		if(head == null) {
			return null;
		}
		else if(head !=null && head.next == null){
			return head;
		}
		else {
			//reverse first pair
			temp = head.next;
			head.next = temp.next;
			temp.next = head;
			head = temp;
			
			//call method recursively
			head.next.next = reversePairRecursive(head.next.next);
			return head;
		}
	}
	
	// Iterative solution
	private Node reversePairIterative(Node head) {
		
		Node temp1 = null;
		Node temp2 = null;
		Node current = head;
		
		while(current != null && current.next != null) {
			
			if(temp1 != null) {
				temp1.next.next = current.next;	
			}
			temp1 = current.next;
			current.next = current.next.next;
			temp1.next = current;
			
			if(temp2 == null) {
				temp2 = temp1;
			}
			current = current.next;
		}
		return temp2;
	}
	
	
	public static void main(String[] args) {

		ReversePairInLL reverse = new ReversePairInLL();
		reverse.create();
		
		//Node  head = reverse.reversePairRecursive(reverse.a.head);
		
		Node  head = reverse.reversePairIterative(reverse.a.head);
		while(head != null) {
			System.out.println("-> " + head.data);
			head = head.next;
		}
	}
}