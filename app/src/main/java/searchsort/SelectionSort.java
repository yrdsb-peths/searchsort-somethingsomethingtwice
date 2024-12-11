package searchsort;

public class SelectionSort {
    /**
     * Sort the array arr using selection sort algorithm.
     */
    public static void sort(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            int min = lo;
            for (int i = lo + 1; i < arr.length; i++) {
                if (arr[i] < arr[lo])
                    min = i;
            }
            Util.exch(arr, min, lo++);
        }
    }
}
