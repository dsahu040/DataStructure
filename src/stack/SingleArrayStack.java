package stack;

/**
 * Stack implementation using Array
 * 
 * @author DEEP
 *
 */
public class SingleArrayStack {
	
	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public SingleArrayStack(int s)
	{
		this.maxSize = s;
		this.stackArray = new char[maxSize];
		top = -1;
	}
	
	public char push(char data){
		if(top<maxSize-1){
			top++;
			stackArray[top] = data;
			return data;
		} 
		return 0;
	}
	
	public char pop(){
		if(top >=0){
			return stackArray[top--];
		}
		return 0;
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == maxSize-1);
	}
	
	public char top(){
		return stackArray[top];
	}
	
	public void printStack(){
		if(top >=0){
			System.out.println("Elements in stack : ");
			for (int i = 0; i <= top; i++) {  
			    System.out.println(stackArray[i]); 
			}	
		}
	}
	
	public static void main(String[] args){
		SingleArrayStack arrayStack = new SingleArrayStack(5);
		
		System.out.println("empty : "+ arrayStack.isEmpty());
		arrayStack.push('a');
		arrayStack.push('b');
		arrayStack.push('c');
		arrayStack.push('d');
		arrayStack.push('e');
		System.out.println("full : "+ arrayStack.isFull());
		
		arrayStack.printStack();
	}
}
