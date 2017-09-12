package stack;

/**
 * The code snippet checks if a text contains balanced parenthesis or not using stack 
 * 
 * @author DEEP
 *
 */
public class BalancedExpressionCheck {

	public SingleArrayStack stack;
	
	public String checkBalance(String input) {
		
		stack = new SingleArrayStack(100);
		
		char[] s = input.toCharArray();
		
		for(char c : s){
			if(c == '[' || c == '{' || c == '('){
				stack.push(c);
			} 
			else if((c == ']' || c == '}' || c == ')') && !stack.isEmpty()){
					
				if((stack.top() == '[' && c == ']') ||
						(stack.top() == '{' && c == '}') ||
						 stack.top() == '(' && c == ')'){
						
					stack.pop();
				} else {
					return "Not Balanced";
				}
				
			} else {
				if((c == ']' || c == '}' || c == ')') && stack.isEmpty()) {
					return "Not Balanced";
				}
			}	
		}
		
		if(stack.isEmpty()){
			return "Balanced Paranthisis";
		} else
			return "Not Balanced";
	}
	
	public static void main(String[] args) {

		BalancedExpressionCheck check = new BalancedExpressionCheck();
		System.out.println(check.checkBalance("((A+B)+[C-D])"));
	}

}
