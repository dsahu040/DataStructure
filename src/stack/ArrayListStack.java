package stack;

import java.util.ArrayList;

/**
 * Stack implementation using ArrayList
 * 
 * @author DEEP
 *
 */
public class ArrayListStack {

	private ArrayList<Object> stack = null;
	
	public ArrayListStack(){
		stack = new ArrayList<Object>();
	}
	
	public Object push(Object data) {
		stack.add(data);
		return data;
	}
	
	public Object pop() {
		if(!stack.isEmpty()){
			Object s = stack.get(stack.size()-1);
			stack.remove(stack.size()-1);
			return s;
		}
		return null;
	}
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	public Object top(){
		if(!stack.isEmpty()){
			return stack.get(stack.size()-1);
		}
		return null;
	}
	
	public void printElements() {
		if(!stack.isEmpty()){
			System.out.println("Elements in stack : ");
			for (int i = 0; i <= stack.size()-1; i++) {  
			    System.out.println(stack.get(i)); 
			}	
		}
	}
	
	public static void main(String[] args) {

		ArrayListStack stack = new ArrayListStack();
		 System.out.println("empty : " + stack.isEmpty());
		 stack.push("73");
		 stack.push("82");
		 stack.push("19");
		 stack.push("36");
		 stack.push("40");
		 stack.printElements();
	}

}
