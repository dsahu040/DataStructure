package stack;

import java.util.Scanner;

/**
 * This program evaluates "postfix" expressions (also called "Reverse Polish 
 * Notation"), which are mathematical expressions but with the operators placed
 * after operands instead of between.
 * For example: 1 + 2 * 3 + 4  is written as 1 2 3 * + 4 +
 * 
 * @author DEEP
 *
 */
public class EvaluatePostfix {

	private ArrayListStack stack;
	
	@SuppressWarnings("resource")
	public int evaluate(String exp) {
		
		stack = new ArrayListStack();
		Scanner tokens = new Scanner(exp);
		
		while(tokens.hasNext()){
			
			if(tokens.hasNextInt()) {
				stack.push(tokens.nextInt());
			
			}else {
				int num2 = (int)stack.pop();
				int num1 = (int)stack.pop();
				
				String op = tokens.next();
				
				if(op.equals("+")){
					stack.push(num1+num2);
				} else if(op.equals("-")){
					stack.push(num1-num2);
				} else if(op.equals("*")){
					stack.push(num1*num2);
				} else {
					stack.push(num1/num2);
				}
			}
		}
		return (int)stack.pop();
	}
	
	
	public static void main(String[] args) {

		EvaluatePostfix evaluatePostfix = new EvaluatePostfix();
		
		System.out.println(evaluatePostfix.evaluate("1 2 +"));
		System.out.println(evaluatePostfix.evaluate("1 2 3 * + 4 +"));
		System.out.println(evaluatePostfix.evaluate("5 2 4 * + 7 -"));
		System.out.println(evaluatePostfix.evaluate("2 3 + 4 5 * +"));
		System.out.println(evaluatePostfix.evaluate("8 5 * 7 4 2 + * +"));
		System.out.println(evaluatePostfix.evaluate("6 8 2 / 1 - *"));
	}

}
