import java.util.Arrays;

public class RecursiveInsertionSort {

    public static void sort (int[] arr, int arr_len) {
        insertionSort(arr, arr_len, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int arr_len, int index) {

        int min_index = index;
        for (int i=index+1; i<arr_len; i++) {
            if (arr[i] < arr[min_index]) {
                min_index = i;
            }
        }
        Swap.swap(index, min_index, arr);
        if (index != arr_len - 1) {
            insertionSort(arr, arr_len, index + 1);
        }
    }
}
