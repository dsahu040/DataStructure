package linkedList;


/**
 * Split a circular linked list into two circular lists. 
 * If length of list is odd then make first list one element larger then second list.
 * 
 * @author DEEP
 *
 */
public class SplitCircularLinkedList {

	public LinkedListIntersection a;
	public static Node head1;
	public static Node head2;
	
	private void create() {
		
		a = new LinkedListIntersection();
		a.addAtEnd(5);
		a.addAtEnd(74);
		a.addAtEnd(82);
		a.addAtEnd(49);
		a.addAtEnd(65);
		a.addAtEnd(39);
		a.addAtEnd(27);
		a.display();
		a.head.next.next.next.next.next.next.next = a.head;
	}
	
	/* Function to split a list (starting with head) into two lists.
    head1_ref and head2_ref are references to head nodes of 
    the two resultant linked lists */
   void splitList(Node head) {
       Node slow_ptr = head;
       Node fast_ptr = head;

       if (head == null) {
           return;
       }

       /* If there are odd nodes in the circular list then
        fast_ptr->next becomes head and for even nodes 
        fast_ptr->next->next becomes head */
       while (fast_ptr.next != head
               && fast_ptr.next.next != head) {
           fast_ptr = fast_ptr.next.next;
           slow_ptr = slow_ptr.next;
       }

       /* If there are even elements in list then move fast_ptr */
       if (fast_ptr.next.next == head) {
           fast_ptr = fast_ptr.next;
       }

       /* Set the head pointer of first half */
       head1 = head;

       /* Set the head pointer of second half */
       if (head.next != head) {
           head2 = slow_ptr.next;
       }
       /* Make second half circular */
       fast_ptr.next = slow_ptr.next;

       /* Make first half circular */
       slow_ptr.next = head;
	}
	
	 /* Function to print nodes in a given singly linked list */
    void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(" -> " + temp.data);
                temp = temp.next;
            } while (temp != node);
        }
    }
	
	public static void main(String[] args){
		
		SplitCircularLinkedList split = new SplitCircularLinkedList();
		split.create();
		
		split.splitList(split.a.head);
		System.out.println("First circular list : ");
		split.printList(head1);
		System.out.println(" ");
		System.out.println("Second circular list : ");
		split.printList(head2);
		
		
	}
	
}
