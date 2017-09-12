package stack;

/**
 * Create a data structure twoStacks that represents two stacks. 
 * Implementation of twoStacks should use only one array, 
 * i.e., both stacks should use the same array for storing elements. 
 * 
 * @author DEEP
 */
public class TwoStacks {

	int size;
	int top1;
	int top2;
	int arr[];
	
	TwoStacks(int n) {
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}
	
	private void push1(int x) {
		if(top1 < top2-1) {
			top1++;
			arr[top1] = x;
		}else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
	}
	
	private void push2(int x) {
		if(top1 < top2-1) {
			top2--;
			arr[top2] = x;
 		} else {
 			System.out.println("Stack Overflow");
 			System.exit(1);
 		}
	}
	
	private int pop1() {
		if(top1 >= 0) {
			int x = arr[top1];
			top1--;
			return x;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	private int pop2() {
		if(top2<size) {
			int x = arr[top2];
			top2++;
			return x;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}
	

	public static void main(String[] args) {

		TwoStacks ts = new TwoStacks(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(34);
		
		System.out.println("Popped element from stack 1 is " + ts.pop1());
		ts.push2(40);
		System.out.println("Popped element from stack 2 is " + ts.pop2());
	}

}
