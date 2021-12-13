import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void sort(int[] arr) {
        int arr_len = arr.length;
        bubbleSort(arr, arr_len);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int len) {

        for (int i=0; i<len-1; i++) {
            if (arr[i] > arr[i+1])
                Swap.swap(i, i+1, arr);
        }
        if (len > 2)
            bubbleSort(arr, len - 1);
    }
}
