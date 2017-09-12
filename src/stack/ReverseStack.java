package stack;

import java.util.Stack;

/**
 * Given a Stack,  how to reverse the elements of the stack using only stack operations(push and pop)
 * 
 * @author DEEP
 */
public class ReverseStack {

	static Stack<Character> st = new Stack<>();
	
	private static void insertAtBottom(char x) {
		
		if(st.isEmpty()) {
			st.push(x);
		} else {
			char a = st.peek();
			st.pop();
			insertAtBottom(x);
			st.push(a);
		}
	}
	
	private static void reverse() {
		
		if(st.size() > 0) {
			char x = st.peek();
			st.pop();
			reverse();
			
			insertAtBottom(x);
		}
	}
	
	public static void main(String[] args) {
		 
		st.push('8');
		st.push('5');
		st.push('7');
		st.push('9');
		
		System.out.println("Origianl Stack");
		System.out.println(st);
		
		reverse();
		System.out.println("Reverse Stack");
		System.out.println(st);
	}
}
