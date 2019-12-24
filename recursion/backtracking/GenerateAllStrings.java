package recursion.backtracking;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Generate all the Strings of n bits. Assume A[0..n-1] is an array of size n. 
 * @author DEEP
 *
 */

public class GenerateAllStrings {

	int[] A;
	
	public GenerateAllStrings(int n){
		A = new int[n];
	}
	
	private void generate(int n) {
		if(n<=0) {
			System.out.println(Arrays.toString(A));
		} else {
			A[n-1]=0;
			generate(n-1);
			A[n-1]=1;
			generate(n-1);
		}
	}
	
	public static void main(String[] args) {

		System.out.println("Enter desired size of string");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		GenerateAllStrings allStrings = new GenerateAllStrings(n);
		allStrings.generate(n);
	}
	
	

}
