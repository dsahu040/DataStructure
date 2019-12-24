package linkedList;

/**
 * Find middle element of a given linked list
 * 
 * @author DEEP
 *
 */
public class FindMiddleOfLL {

	public LinkedListIntersection a;
	
	void createLists() {
		
		a = new LinkedListIntersection();
		a.addAtEnd(5);
		a.addAtEnd(12);
		a.addAtEnd(37);
		a.addAtEnd(4);
		a.addAtEnd(18);
		a.addAtEnd(25);
		a.addAtEnd(25);
		System.out.println("List A : ");
		a.display();
	}
	
	//find middle element
	private Node findMiddle(Node head){
		Node ptr1;
		Node ptr2;
		
		if(head == null){
			return null;
		}
		ptr1 =head; 
		ptr2 = head;
		int i = 0;
		
		while(ptr1.next != null){
			if(i==0){
				ptr1 = ptr1.next;
				i=1;
			}
			else if(i==1){
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
				i=0;
			}
		}
		return ptr2;
	}
	
	public static void main(String[] args) {

		FindMiddleOfLL list = new FindMiddleOfLL();
		list.createLists();
		
		Node n = list.findMiddle(list.a.head);
		System.out.println("The middle value of given linked list is : " + n.data);
	}

}
