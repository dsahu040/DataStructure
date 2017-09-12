package linkedList;

/**
 * Given a linked list, how do you modify it such that all the even numbers appear 
 * before all the odd numbers in the modified linked list.
 * 
 * @author DEEP
 *
 */
public class ExchangeEvenOddList {

	public LinkedListIntersection a;
	
	void create(){
		
		a = new LinkedListIntersection();
		a.addAtEnd(3);
		a.addAtEnd(8);
		a.addAtEnd(26);
		a.addAtEnd(7);
		a.addAtEnd(4);
		a.addAtEnd(11);
		a.addAtEnd(7);
		a.addAtEnd(9);
		a.addAtEnd(16);
		a.display();
	}
	
	Node exchange(Node head) {
		
		Node evenStart = null;
		Node oddStart = null;
		Node oddEnd = null;
		Node evenEnd = null;
		Node itr = head;
		
		if(head==null){
			return head;
		}else {
			while(itr!=null){
				if(itr.data%2==0){
					if(evenStart==null) {
						evenStart = itr;
						evenEnd = evenStart;
					} else {
						evenEnd.next = itr;
						evenEnd = evenEnd.next;
					}
				}
				else {
					if(oddStart==null){
						oddStart = itr;
						oddEnd = oddStart;
					} else {
						oddEnd.next = itr;
						oddEnd = oddEnd.next;
					}
				}
				itr = itr.next;
			}
			if(oddStart == null || evenStart == null) {
	            return null;
	        }
			evenEnd.next = oddStart;
			oddEnd.next = null;
			return evenStart;
		}
	}
	
	public static void main(String[] args) {

		ExchangeEvenOddList evenOddList = new ExchangeEvenOddList();
		evenOddList.create();
		
		Node result = evenOddList.exchange(evenOddList.a.head);
		
		while(result !=null) {
			System.out.println("new list : " + result.data);
			result = result.next;
		}
	}

}
