package linkedList;


/**
 * Floyd Cycle Algorithm
 *
 * Given a linked list, check if the the linked list has loop or not. 
 *
 * A given linked list is a snake or snail
 *
 * @author DEEP
 *
 */
public class DetectLoopInLL {

	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	//insert new node at front of the list
	private void push(int new_data){
		Node new_Node = new Node(new_data);
		new_Node.next=head;
		head = new_Node;
	}
		
	private int detectLoop() {
		
		Node slow_p = head;
		Node fast_p = head;
		
		while(slow_p !=null && fast_p !=null && fast_p.next !=null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if(slow_p == fast_p){
				System.out.println("found loop");
				return 1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {

		DetectLoopInLL loopInLL = new DetectLoopInLL();
		loopInLL.push(50);
		loopInLL.push(20);
		loopInLL.push(15);
		loopInLL.push(4);
		loopInLL.push(10);
		
		//creating a loop for testing
		loopInLL.head.next.next.next.next = loopInLL.head.next;
		
		loopInLL.detectLoop();
	}
}
