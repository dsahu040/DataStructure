package array;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */
public class RotateArray {

    /**
     * function to lef rotate the array
     */
    private void leftRotate(int arr[], int d, int n) {

        int i;
        for (i = 0; i < d; i++) {
            leftRoateByOne(arr, n);
        }
    }

    private void leftRoateByOne(int arr[], int n) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[i] = temp;
    }

    /**
     * function to print array
     */
    private void printArray(int arr[]) {
        for (int a : arr) {
            System.out.print(" " + a);
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        rotateArray.leftRotate(arr, 2, 7);
        rotateArray.printArray(arr);
    }
}
