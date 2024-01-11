public class bubbleSort {
    public static void bSort(int[] arr){
        int n = arr.length;
        Boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!swapped)
                return;
        }
    }

    public static void main(String[] args){
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        bSort(arr);
        System.out.println("Sorted array is: ");
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
