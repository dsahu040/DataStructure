package queue;

import java.util.Scanner;

public class LinkedQueueImplement {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		LinkedQueue lq = new LinkedQueue();
		
		System.out.println("Linked Queue Test \n");
		char ch;
		
		do {
			System.out.println("\nQueue Operations");
			System.out.println("1 insert");
			System.out.println("2 remove");
			System.out.println("3 peek");
			System.out.println("4 check empty");
			System.out.println("5 size");
			
			int choice = scan.nextInt();
			
			switch(choice){
			case 1 :
				System.out.println("Enter integer element to insert");
				lq.insert(scan.nextInt());
				break;
				
			case 2 :
				try {
					System.out.println("remove element" + lq.remove());
				} catch(Exception e){
					System.out.println("error : " + e.getMessage() );
				}
				break;
				
			case 3 :
				try {
					System.out.println("peek element" + lq.peek());
				} catch(Exception e){
					System.out.println("error : " + e.getMessage() );
				}
				break;
				
			case 4 :
				System.out.println("Empty stack " + lq.isEmpty());
				break;
				
			case 5 : 
				System.out.println("size = " + lq.getSize());
				break;
			
			default :
				System.out.println("Wrong entry\n ");
				break;
			}
			
			lq.display();
			
			System.out.println("\nDo you want to continue(Type y or n)\n");
			ch = scan.next().charAt(0);
		} while (ch=='Y' || ch=='y');
	}
}
