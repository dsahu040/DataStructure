package linkedList;

/**
 * Find out if given linked list length is even or odd.
 * @author DEEP
 *
 */
public class EvenOddLengthOfLL {

	public LinkedListIntersection a;
	
	void createList() {
		a = new LinkedListIntersection();
		a.addAtEnd(27);
		a.addAtEnd(59);
		a.addAtEnd(5);
		a.addAtEnd(14);
		a.addAtEnd(31);
		a.addAtEnd(31);
		a.display();
	}
	
	private String isListLengthEvenOrOdd(Node head) {
		
		while(head != null && head.next != null) {
			head = head.next.next;
		}
		if(head == null){
			return "Even";
		}
		return "Odd";
		
	}
	
	public static void main(String[] args) {

		EvenOddLengthOfLL lengthOfLL = new EvenOddLengthOfLL();
		lengthOfLL.createList();
		System.out.println(lengthOfLL.isListLengthEvenOrOdd(lengthOfLL.a.head));
	}

}
