package linkedList;


public class FindLengthOfLoopInLL {

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
		
	private int findLengthOfLoop() {
		
		Node slow_p = head;
		Node fast_p = head;
		
		boolean loopExist=false;
		int count = 0;
		
		while(slow_p !=null && fast_p !=null && fast_p.next !=null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if(slow_p == fast_p){
				loopExist = true;
				break;
			}
		}
		
		if(loopExist){
			fast_p = fast_p.next;
			while(slow_p != fast_p){
				fast_p = fast_p.next;
				count++;
			}
			return count;
		}
		return 0;
	}
	
	public static void main(String[] args) {

		FindLengthOfLoopInLL loopInLL = new FindLengthOfLoopInLL();
		loopInLL.push(39);
		loopInLL.push(50);
		loopInLL.push(15);
		loopInLL.push(4);
		loopInLL.push(10);
		loopInLL.push(17);
		loopInLL.push(29);
		loopInLL.push(34);
		
		//creating a loop for testing
		loopInLL.head.next.next.next.next.next.next.next.next = loopInLL.head.next.next.next;
		
		System.out.println("The size of loop in Linked List is : " + loopInLL.findLengthOfLoop());
	}
}
