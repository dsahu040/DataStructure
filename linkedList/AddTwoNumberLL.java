package linkedList;

public class AddTwoNumberLL {

	public LinkedListIntersection a;
	public LinkedListIntersection b;
	
	void create() {
		a = new LinkedListIntersection();
		a.addAtEnd(5);
		a.addAtEnd(6);
		a.addAtEnd(7);
		a.addAtEnd(1);
		a.addAtEnd(2);
		a.display();
		
		b = new LinkedListIntersection();
		b.addAtEnd(6);
		b.addAtEnd(3);
		b.addAtEnd(5);
		b.addAtEnd(9);
		b.display();
	}
	
	private Node findSumOfNumbers(Node h1, Node h2) {
		
		int carry = 0;
		
		Node newHead = null;
		Node temp = null;
		int sum = 0;
		
		int firstItr = 0;
		while(h1!=null || h2!=null) {
			firstItr++;
			sum=carry;
			if(h1 != null) {
				sum = sum + h1.data;
				h1 = h1.next;
			}
			if(h2 != null) {
				sum = sum + h2.data;
				h2 = h2.next;
			}
			
			carry = sum/10;
			sum = sum%10;
			
			
			if(firstItr==1) {
				temp = new Node(sum);
				newHead = temp;
			} else {
				Node tempSum = new Node(sum);
				temp.next = tempSum;
				temp = temp.next;
			}
		}
		if(carry !=0) {
			Node tempNode = new Node(carry);
			temp.next = tempNode;
		}
		return newHead;
	}
	
	public static void main(String[] args) {

		AddTwoNumberLL addNumbers = new AddTwoNumberLL();
		addNumbers.create();
		
		Node n =addNumbers.findSumOfNumbers(addNumbers.a.head, addNumbers.b.head);
		
		System.out.println("Sum of a & b list's data : ");
		while (n != null) {
			System.out.println(" -> " + n.data);
			n = n.next;
		}
	}

}
