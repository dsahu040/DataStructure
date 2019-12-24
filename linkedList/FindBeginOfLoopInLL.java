package linkedList;

/**
 * Given a linked list, check if the the linked list has loop or not.
 * If Loop is present then find its head.
 *  
 * @author DEEP
 *
 */
public class FindBeginOfLoopInLL {

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
		
	private int findBeginOfLoop() {
		
		Node slow_p = head;
		Node fast_p = head;
		
		boolean loopExist=false;
		
		while(slow_p !=null && fast_p !=null && fast_p.next !=null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if(slow_p == fast_p){
				loopExist = true;
				break;
			}
		}
		if(loopExist){
			slow_p = head;
			while(slow_p != fast_p){
				fast_p = fast_p.next;
				slow_p = slow_p.next;
			}
			return slow_p.data;
		}
		return 0;
	}
	
	public static void main(String[] args) {

		FindBeginOfLoopInLL loopInLL = new FindBeginOfLoopInLL();
		loopInLL.push(50);
		loopInLL.push(20);
		loopInLL.push(15);
		loopInLL.push(4);
		loopInLL.push(10);
		loopInLL.push(17);
		loopInLL.push(29);
		loopInLL.push(34);
		
		//creating a loop for testing
		loopInLL.head.next.next.next.next.next.next.next = loopInLL.head.next.next.next;
		
		System.out.println("The value of node at the begining of loop is : " + loopInLL.findBeginOfLoop());
	}
}
