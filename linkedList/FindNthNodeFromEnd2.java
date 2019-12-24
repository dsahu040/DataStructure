package linkedList;


/**
 * Find Nth node from the end of linked list
 * 
 * In this algo we are iterating the Linked list only once.
 * @author DEEP
 *
 */
public class FindNthNodeFromEnd2 {

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

		Node temp = head;
		Node tempNth = null;
		
		for(int i=1; i<n; i++){
			if(temp != null){
				temp=temp.next;
			}
		}
		while(temp != null){
			if(tempNth==null){
				tempNth=head;
			} else{
				tempNth=tempNth.next;
			}
			temp=temp.next;
		}
		if(tempNth != null){
			System.out.println(tempNth.data);
		}
	}
	
	//insert new node at front of the list
	private void push(int new_data){
		Node new_Node = new Node(new_data);
		new_Node.next=head;
		head = new_Node;
	}

	public static void main(String[] args) {

		FindNthNodeFromEnd2 fromEnd = new FindNthNodeFromEnd2();
		fromEnd.push(20);
		fromEnd.push(4);
		fromEnd.push(15);
		fromEnd.push(32);
		
		fromEnd.printNthFromEnd(2);
	}

}
