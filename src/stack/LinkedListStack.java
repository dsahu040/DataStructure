package stack;

/**
 * Java Program to Implement Stack using Linked List
 * 
 * @author DEEP
 *
 */
public class LinkedListStack {
	
	private Node top;
	private int size;
	
	public LinkedListStack(){
		top = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int getSize(){
		return size;
	}
	
	public int push(int data){
		Node nptr = new Node(data, null);
		if(top == null){
			top = nptr;
		} else {
			nptr.setLink(top);
			top = nptr;			
		}
		size++;
		return data;
	}
	
	public int pop(){
		
		if(isEmpty()){
			return 0;
		} 
		Node ptr = top;
		top = ptr.getLink();
		size--;
		return ptr.getData();
	}
	
	public int top() {
		if(isEmpty()){
			return 0;
		}
		return top.getData();
	}
	
	public void printElements(){
		System.out.println("Stack elements: ");
		Node ptr = top;
		while(ptr != null){
			System.out.println(ptr.getData() + " ");
			ptr = ptr.getLink();
		}
	}
	
	public static void main(String[] args){
		
		LinkedListStack stack = new LinkedListStack();
		
		System.out.println("empty : " + stack.isEmpty());
		
		stack.push(94);
		stack.push(38);
		stack.push(37);
		stack.push(29);
		
		System.out.println("peak : " + stack.top() );
		System.out.println("pop : " + stack.pop());
		stack.printElements();
	}
}
  
/*  Class Node  */
class Node
{
    protected int data;
    protected Node link;
 
    /*  Constructor  */
    public Node()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public Node getLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
}
 
