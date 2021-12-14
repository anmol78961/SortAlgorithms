import java.util.Arrays;

public class BubbleSort {
    public static void sort (int[] arr, int arr_len) {
        
        for (int i=0; i<arr_len; i++) {
            for (int j=0; j<arr_len - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    Swap.swap(j, j+1, arr);
                }
            }
        } 
        System.out.println(Arrays.toString(arr));
    }
}
