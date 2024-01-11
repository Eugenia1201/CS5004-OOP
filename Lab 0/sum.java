public class sum {

    /**
     * Sums and array
     * @param arr a given array
     * @return the sum
     */

    public static int arraySum(int[] arr) {
        int s = 0;
        for (int i : arr) {
            s += i;
        }

        // with a indexing version:
        // for (int i = 0; i < arr.length; i++) {
        //     s += arr[i];
        // }
        return s;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 15};
        int ans = arraySum(arr);
        System.out.println("Sum of the array is " + ans);
    }
    
}