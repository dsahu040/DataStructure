package linkedList;

/**
 * Print a given linked list from end.
 * 
 * @author DEEP
 *
 */
public class PrintListFromEnd {

public LinkedListIntersection a;
	
	void createLists() {
		
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
	
	private void printFromEnd(Node head) {
		if(null == head) {
			return;
		}
		printFromEnd(head.next);
		System.out.println(" " + head.data);
	}
	
	public static void main(String[] args) {
		PrintListFromEnd fromEnd = new PrintListFromEnd();
		fromEnd.createLists();
		fromEnd.printFromEnd(fromEnd.a.head);
	}

}
