package linkedList;

public class LinkedListIntersection {

	public Node head;
	
	public LinkedListIntersection() {
		head = null;
	}
	
	public Node addAtEnd(int d) {
		
		Node n = new Node(d);
		
		if(head == null){
			n.next = head;
			head = n;
		} else {
			Node currNode = head;
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = n;
		}
		return n;
	}
	
	public void display() {
		System.out.println("");
		Node currNode = head;
		while(currNode != null) {
			System.out.println(" -> " + currNode.data);
			currNode = currNode.next;
		}
		System.out.println("");
	}

	
	public void createIntersection(LinkedListIntersection a, Node nd) {
		Node hd = a.head;
		while(hd != nd) {
			hd = hd.next;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = hd;
	}
}
