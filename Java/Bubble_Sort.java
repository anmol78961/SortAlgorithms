import java.util.Arrays;

public class BubbleSort {
    public static void sort (int[] arr) {
        int arr_len = arr.length;
        for (int i=0; i<arr_len; i++) {
            for (int j=0; j<arr_len - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(j, j+1, arr);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
