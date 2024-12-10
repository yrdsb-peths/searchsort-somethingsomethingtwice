package searchsort;

public class MergeSort extends Sort {
    /**
     * Sort the array arr using merge sort algorithm.
     */
    @Override
    public void sort(int[] arr) {
        //merge(arr, 0, arr.length - 1);
    }

    /*
     * Merge the two sorted arrays left and right into the array arr.
     */
    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0;
        for (int num : left)
            arr[i++] = num;
        for (int num : right)
            arr[i++] = num;
    }
}
