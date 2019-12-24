package recursion.backtracking;

import java.util.Arrays;

/**
 *  A string consists of ‘0’, ‘1’ and '?'. The question mark   can be either '0' or '1'.
 *   Find all possible combinations for a string. 
 * @author DEEP
 *
 */

public class ReplaceWildcard {

	public static void main(String[] args) {

		String s= "1?00?101";
		String current = null;
		ReplaceWildcard replaceWildcard = new ReplaceWildcard();
		replaceWildcard.replace(s.toCharArray(), 0, current);
	}
	
	private void replace(char[] arr, int i, String current) {
		if(i==arr.length){
			System.out.println(Arrays.toString(arr));
		}
		if(arr[i]=='?'){
			arr[i] = '0';
			replace(arr, i+1, current);
			arr[i] = '1';
			replace(arr, i+1, current);
		}
		else {
			replace(arr, i+1, current);
		}
	}

}
