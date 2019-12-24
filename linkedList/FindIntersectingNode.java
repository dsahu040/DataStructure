package linkedList;

/**
 * If two singly linked list are intersecting at some point and become a single linked list.
 * The head of both lists are known. Find the merging point.
 * 
 * @author DEEP
 *
 */
public class FindIntersectingNode {

	public LinkedListIntersection a;
	public LinkedListIntersection b;
	
	public void createLists() {
		
		a = new LinkedListIntersection();
		a.addAtEnd(1);
		a.addAtEnd(10);
		a.addAtEnd(20);
		Node tmp = a.addAtEnd(30);
		a.addAtEnd(40);
		a.addAtEnd(50);
		a.addAtEnd(60);
		
		System.out.println("List A : ");
		a.display();
		
		b = new LinkedListIntersection();
		b.addAtEnd(5);
		b.addAtEnd(15);
		b.createIntersection(a, tmp);
		System.out.println("List B : ");
		b.display();
	}
	
	public void findIntersection(){
		int a_len = 0;
		int b_len = 0;
		int len_diff = 0;
		boolean intsctFound = false;
		Node an = a.head;
		Node bn = b.head;
		
		while(an != null) {
			a_len++;
			an = an.next;
		}
		
		while(bn != null) {
			b_len++;
			bn = bn.next;
		}
		
		an = a.head;
		bn = b.head;
		if(a_len>b_len) {
			len_diff = a_len - b_len;
			while(len_diff!=0){
				an = an.next;
				len_diff--;
			}
		} else {
			len_diff = b_len - a_len;
			while(len_diff!=0){
				bn = bn.next;
				len_diff--;
			}
		}
		
		while(an != null && bn != null) {
			if(an == bn) {
				System.out.println("Intersection found at : " + an.data);
				intsctFound = true;
				break;
				
			} else {
				an = an.next;
				bn = bn.next;
			}
		}
		
		if(intsctFound != true) {
			System.out.println("Intersection not found");
		}
	}
	
	public static void main(String[] args) {

		FindIntersectingNode intersectingNode = new FindIntersectingNode();
		intersectingNode.createLists();
		intersectingNode.findIntersection();
	}

}
