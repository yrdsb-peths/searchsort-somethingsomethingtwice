package searchsort;

import java.util.Random;

public class Util {
    /**
     * Shuffle the elements in the array arr using Fisher-Yates shuffle algorithm.
     */
    public static int[] shuffle(int[] arr, Long seed) {
        // Initialize a Random object with the given seed if provided
        Random random = (seed != null) ? new Random(seed) : new Random();

        // Implement the Fisher-Yates shuffle algorithm
        // To generate a random index between 0 and i (exclusive) use:
        // random.nextInt(i)
        for (int i = arr.length - 1; i > 0; i--) {
            exch(arr, i, random.nextInt(arr.length));
        }
        return arr;
    }

    /**
     * Exchange the elements at indices i and j in the array arr.
     */
    public static void exch(int[] arr, int i, int j) {
        int prev_i = arr[i];
        arr[i] = arr[j];
        arr[j] = prev_i;
    }

    /**
     * Generate a random array of size n where each element is between 0 and n-1.
     */
    public static int[] generateRandomArray(int n, Long seed) {
        // Create a new integer array of size n
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = i;
        // Shuffle the array using the Shuffle method with the given seed
        Util.shuffle(arr, seed);
        // Return the shuffled array
        return arr;
    }

    /**
     * Check if the array arr is sorted in ascending order.
     */
    public static boolean isSorted(int[] arr) {
        int previous = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i >= previous)
                previous = i;
            else
                return false;
        }
        return true;
    }
}
