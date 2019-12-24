package linkedList;

public class ReverseSinglyLinkedList {

	 public LinkedListIntersection a;
	
	/**
	 * reversing singly linked list using iterative method
	 */
	private Node reverseList(){
		Node prevNode = null;
		Node nextNode = null;
		
		while(a.head != null) {
			nextNode = a.head.next;
			a.head.next = prevNode;
			prevNode = a.head;
			a.head = nextNode;
		}
		return prevNode;
	}
	
	/**
	 * reversing singly linked list using recursive method
	 */
	private Node reverseListRecursive(Node head) {
		if(head == null){
			return null;
		}
		if(head.next == null) {
			return head;
		}
		
		Node second = head.next;
		//unlink list from the rest 
		head.next = null;
		//reverse list from second element
		Node reverse = reverseListRecursive(second);
		second.next = head;
		return reverse;
		
		
	}
		
	
	public void createLists() {
		
		a = new LinkedListIntersection();
		a.addAtEnd(5);
		a.addAtEnd(12);
		a.addAtEnd(37);
		a.addAtEnd(4);
		a.addAtEnd(18);
		a.addAtEnd(25);
		System.out.println("List A : ");
		a.display();
	}
	
	public static void main(String[] args) {

		ReverseSinglyLinkedList list = new ReverseSinglyLinkedList();
		list.createLists();		
		
		//iterative solution
		/*Node n =  list.reverseList();
		System.out.println("Reverse List Iteratively : ");
		while(n != null) {
			System.out.println(" -> " + n.data);
			n = n.next;
		}*/
		
		
		//recursive solution
		Node nr = list.reverseListRecursive(list.a.head);
		System.out.println("Reverse List Recursively : ");
		while(nr != null) {
			System.out.println(" -> " + nr.data);
			nr = nr.next;
		}
	}

}
