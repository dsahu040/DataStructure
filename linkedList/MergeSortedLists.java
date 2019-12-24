package linkedList;

/**
 * Given two sorted linked lists, merge them into the third list in sorted order
 * 
 * @author DEEP
 *
 */
public class MergeSortedLists {

	public LinkedListIntersection a;
	public LinkedListIntersection b;
	
	void create(){
		a = new LinkedListIntersection();
		a.addAtEnd(3);
		a.addAtEnd(12);
		a.addAtEnd(17);
		a.addAtEnd(29);
		a.addAtEnd(34);
		a.addAtEnd(56);
		a.addAtEnd(78);
		a.display();
		
		b = new LinkedListIntersection();
		b.addAtEnd(5);
		b.addAtEnd(13);
		b.addAtEnd(19);
		b.addAtEnd(23);
		b.addAtEnd(59);
		b.addAtEnd(64);
		b.addAtEnd(79);
		b.addAtEnd(84);
		b.addAtEnd(107);
		b.display();
	}
	
	// Using recursive method
	private Node mergeSortedLists(Node a, Node b){
		Node result = null;
		
		if(a==null){
			return b;
		}
		if(b==null){
			return a;
		}
		if(a.data<=b.data){
			result = a;
			result.next = mergeSortedLists(a.next, b);
		} else {
			result = b;
			result.next = mergeSortedLists(b.next, a);
		}
		return result;
	}
	
	// Using iterative method
	private Node mergeSortedListsItr(Node a, Node b){
		
		Node head = new Node(0);
	    Node p = head;
	 
	    while(a!=null || b!=null) {

	    	if(a!=null && b!=null) {
	            if(a.data <= b.data) {
	                p.next = a;
	                a=a.next;
	            } else {
	                p.next=b;
	                b=b.next;
	            }
	            p = p.next;
	        } else if(a==null) {
	            p.next = b;
	            break;
	        } else if(b==null) {
	            p.next = a;
	            break;
	        }
	    }
	 
	    return head.next;
	}
	
	public static void main(String[] args) {

		MergeSortedLists lists = new MergeSortedLists();
		lists.create();
		
		//recursive solution
		Node r = lists.mergeSortedLists(lists.a.head, lists.b.head);
		while(r != null){
			System.out.println(" -> " + r.data);
			r= r.next;
		}
		
		//iterative solution
		/*Node n = lists.mergeSortedListsItr(lists.a.head, lists.b.head);
		
		while(n != null){
			System.out.println(" -> " + n.data);
			n = n.next;
		}*/
	}

}
