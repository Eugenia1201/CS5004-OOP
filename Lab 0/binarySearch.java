public class binarySearch{
    public static int bSearch(int[] arr, int low, int high, int x) {
        // check the base case
        if (high >= low) {
            int mid = (high + low) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return bSearch(arr, low, mid - 1, x);
            } else {
                return bSearch(arr, mid + 1, high, x);
            }
        } else {
            return -1; // Element is not present in the array
        }
    }
    
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = bSearch(arr, 0, arr.length-1, x);
        if (result != -1) {
            System.out.println("Element is present at index " + result);
        } else {
            System.out.println("Element is not present in array");
        }
    }
}
