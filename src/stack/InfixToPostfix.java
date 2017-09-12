package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a java program to covert a valid infix expression to a postfix expression.
	The expression can have the following operators: '+', '-', '%','*', '/' and alphabets from a to z .
	The precedence of the operators (+,-) is lesser than precedence of operators (*,/,%) . Parenthesis have the highest precedence and the expression
	inside it must be converted first . 
	 	
	Examples :
	Infix			Postfix
	a%b				ab%
	a+b*(c+d) 		abcd+*+   
	a+b*c+d			abc*+d+
	
	Use the stack data structure to solve the problem.
 * 
 * @author DEEP
 *
 */
public class InfixToPostfix {
	
	private SingleArrayStack stack;
	
	public String toPostfix(String input) {
		
		stack = new SingleArrayStack(50);
		char symbol;
		String postFix = "";
		
		for(int i=0; i<input.length(); ++i) {
		
			symbol = input.charAt(i);
			if(Character.isLetter(symbol)) {
				postFix = postFix + symbol;
				
			} else if(symbol == '(') {
				stack.push(symbol);
				
			} else if(symbol == ')') {
				while(stack.top() != '(') {
					postFix = postFix + stack.pop();
				}
				stack.pop();
				
			} else {
				while(!stack.isEmpty() && !(stack.top() == '(') && prec(symbol) <= prec(stack.top())) {
					postFix = postFix + stack.pop();
				}
				stack.push(symbol);
			}
		}
		while(!stack.isEmpty()) {
			postFix = postFix + stack.pop();
		}
		return postFix;
	}
	
	private int prec(char x) {
		if(x=='+' || x=='-') {
			return 1;
		}
		if(x=='*' || x=='/' || x=='%') {
			return 2;
		}
		return 0;
	}

	public static void main(String[] args) throws IOException {

		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter the algebraic expression in infix: ");
		String infix = reader.readLine();
		
		InfixToPostfix toPostfix = new InfixToPostfix();
		System.out.println("The expression in postFix is : " + toPostfix.toPostfix(infix));
	}

}
