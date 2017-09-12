package linkedList;

/**
 * Given a singly Linked list, write a function to find the first element from the end
 * whose n%k==0, where n is the number of elements in the list and k is an integer constant.
 * 
 * @author DEEP
 *
 */
public class ModularNodeFromEnd {

	public LinkedListIntersection a;
	
	// to create linked list
		private void create(int n) {
			a = new LinkedListIntersection();
			
			for(int i=1; i<=n; i++) {
				a.addAtEnd(i);
			}
			a.display();
		}
		
		// find modular node from end
		private Node modularNodes(Node head, int k) {
			
			Node modularNode = null;
			int i = 0;
			int j = 0;
			
			if(k<=0){
				return null;
			}
			
			for(i=1; head!=null; head = head.next) {
				if(i%k==0){
					modularNode = head;
				}
				i++;
			}
			
			for(j=0; j<i%k; j++) {
				modularNode = modularNode.next;
			}
			return modularNode;
		}
		
		public static void main(String[] args) {
			
			ModularNodeFromEnd nodeFromEnd = new ModularNodeFromEnd();
			nodeFromEnd.create(19);
			
			Node n = nodeFromEnd.modularNodes(nodeFromEnd.a.head, 3);
			System.out.println("Modular node from end : " + n.data);
		}
}
