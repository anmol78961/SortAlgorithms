public class Main {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 5, 6, 1};
        int arr_len = arr.length;
	    SelectionSort.sort(arr, arr_len);
	    BubbleSort.sort(arr, arr_len);
	    RecursiveBubbleSort.sort(arr, arr_len);
	    InsertionSort.sort(arr, arr_len);
    }
}
