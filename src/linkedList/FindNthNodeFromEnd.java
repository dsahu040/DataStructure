package linkedList;

/**
 * Find Nth node from the end of linked list
 * @author DEEP
 *
 */
public class FindNthNodeFromEnd {

	Node head;
	
	class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	private void printNthFromEnd(int n){
		int length = 0;
		Node temp = head;
		
		//count the number of nodes in LL
		while(temp != null){
			temp = temp.next;
			length++;
		}
		
		if(length<n){
			return;
		}
		
		temp = head;
		
		//find the length-n+1 node from beginning
		for(int i=1; i<length-n+1; i++){
			temp = temp.next;
		}
		System.out.println("requested node from end is :" + temp.data);
	}
	
	//insert new node at front of the list
	private void push(int new_data){
		Node new_Node = new Node(new_data);
		new_Node.next=head;
		head = new_Node;
	}

	public static void main(String[] args) {

		FindNthNodeFromEnd fromEnd = new FindNthNodeFromEnd();
		fromEnd.push(20);
		fromEnd.push(4);
		fromEnd.push(15);
		fromEnd.push(32);
		
		fromEnd.printNthFromEnd(4);
	}

}
