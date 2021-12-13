import java.util.Arrays;

public class SelectionSort {
    public static void sort (int[] arr) {
        int arr_len = arr.length;

        for (int i=0; i<arr_len; i++) {
            int min_index = i;
            for (int j=i+1; j<arr_len; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            Swap.swap(i, min_index, arr);
        }
        System.out.println(Arrays.toString(arr));
    }
}
