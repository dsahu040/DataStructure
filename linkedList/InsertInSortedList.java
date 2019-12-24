package linkedList;

/**
 * Insert a new node in sorted linked list
 * 
 * @author DEEP
 *
 */
public class InsertInSortedList {

	Node head;
	
	public void insert(Node new_node) {
		Node current;
		
		if(head == null || head.data >= new_node.data) {
			new_node.next = head;
			head = new_node;
		
		} else {
			current = head;
			while(current.next !=null && current.next.data < new_node.data) {
				current = current.next;
			}
				
			new_node.next = current.next;
			current.next = new_node;
		}
	}
	
	Node new_Node(int data){
		Node x = new Node(data);
		return x;
	}
	
	void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }
    }
	
	public static void main(String[] args) {

		InsertInSortedList llist = new InsertInSortedList();
		Node new_node;
		new_node = llist.new_Node(5);
        llist.insert(new_node);
        new_node = llist.new_Node(10);
        llist.insert(new_node);
        new_node = llist.new_Node(7);
        llist.insert(new_node);
        new_node = llist.new_Node(3);
        llist.insert(new_node);
        new_node = llist.new_Node(1);
        llist.insert(new_node);
        new_node = llist.new_Node(9);
        llist.insert(new_node);
        System.out.println("Created Linked List");
        llist.printList();
    }		
}
