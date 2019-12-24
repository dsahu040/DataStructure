package linkedList;

public class FindFractionalNode {
	
	public LinkedListIntersection a;
	
	// to create linked list
	private void create(int n) {
		a = new LinkedListIntersection();
			
			for(int i=1; i<=n; i++) {
				a.addAtEnd(i);
			}
		a.display();
	}
		
	/*private Node fractionalNode(Node head, int k) {
		
		Node fractNode = null;
		int i=0;
		if(k<=0) {
			return null;
		}
		
		for (i=0; i<k; i++) {
			if(head!=null) {
				head = head.next;
       		} else {
       			return null;
       		}
		}
		
		while(head!=null) {
			fractNode = fractNode = fractNode.next;
			head = head.next;
		}
		
		return fractNode;
	}*/
	
	private Node fractionalNode(Node head, int k) {
		
		Node fractNode = null;
		int i=0;
		if(k<=0) {
			return null;
		}
		
		for (i=0; head!=null; head=head.next) {
			if(i%k<=0) {
				if(fractNode == null){
					fractNode = head;	
				} else {
				fractNode=fractNode.next;
				}
       		}
			i++;
		}
		return fractNode;
	}
	
	
	public static void main(String[] args) {
		 
	 FindFractionalNode fractionalNode = new FindFractionalNode();
	 fractionalNode.create(19);
	 
	 Node n =fractionalNode.fractionalNode(fractionalNode.a.head, 3);
	 System.out.println("fractional node : " + n.data);
	 
	}

}
