package recursion;

public class SortedArray {

	public static void main(String[] args) {
		int []A = {5, 2,  3, 4};
		SortedArray array = new SortedArray();
		System.out.println("Array is sorted : " + array.isArraySorted(A, A.length));

	}
	
	private boolean isArraySorted(int[] A, int n){
		if(n==1){
			return true;
		}
		if(A[n-1] >= A[n-2]){
			return isArraySorted(A, n-1);
		}
		return false;
	}
}
