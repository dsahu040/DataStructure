package array;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 * <p>
 * Using Juggling algorithm
 */
public class RotateArray_JugglingAlgo {

    private void leftRotate(int arr[], int d, int n) {

        int i, j, k, temp;

        for(i=0; i<gcd(d, n); i++) {
            temp = arr[i];
            j=i;

            while(1 != 0) {
                k = j+d;
                if(k >= n)
                    k = k-n;
                if(k==i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    /**
     * to find out the GCD of two numbers
     */
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    /**
     * print an array
     */
    private void print(int arr[]) {
        for (int a : arr)
            System.out.print(a + " ");
    }

    /**
     * Driver Function
     */
    public static void main(String[] args) {
        RotateArray_JugglingAlgo jugglingAlgo = new RotateArray_JugglingAlgo();
        int arr[] = {1,2,3,4,5,6,7};

        jugglingAlgo.leftRotate(arr, 2, 7);
        jugglingAlgo.print(arr);

    }
}
