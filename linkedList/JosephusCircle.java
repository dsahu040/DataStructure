package linkedList;

/**
 * N people have decided to to elect a leader by arranging themselves in a circle
 * and eliminating every Mth person around the circle, closing ranks as each person drops out.
 * Find which person will be the last one remaining (with rank 1).
 * 
 * @author DEEP
 *
 */
public class JosephusCircle {

	public LinkedListIntersection a;
	
	private void getJosephusPosition(int n, int m) {
		Node p = new Node(0);
		Node q = new Node(0);
	
		p.data =1;
		q = p;
		
		for(int i = 2; i<=n; ++i){
			p.next = new Node(0);
			p = p.next;
			p.data = i;
		}
		p.next = q;
		
		for(int count=n; count>1; --count){
			for(int i=0; i<m-1; ++i){
				p=p.next;
			}
			p.next = p.next.next;
		}
		System.out.println("Last remaining player is : " + p.data);
	}
	
	public static void main(String[] args) {

		JosephusCircle circle = new JosephusCircle();
		circle.getJosephusPosition(14, 2);
	}

}
