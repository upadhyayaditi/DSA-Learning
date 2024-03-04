import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // Initialize the array to be sorted
        int[] arr = { 5, 6, 1, 8, 2, 10 };

        // Call the mergeSort method to sort the array
        arr = mergeSort(arr);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Method to perform merge sort on the array
    static int[] mergeSort(int[] arr) {
        // Base case: if the array has only one element, return the array
        if (arr.length == 1) {
            return arr;
        }

        // Calculate the middle index of the array
        int mid = arr.length / 2;

        // Recursively sort the left and right halves of the array
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge the sorted left and right halves
        return merge(left, right);
    }

    // Method to merge two sorted arrays
    static int[] merge(int[] first, int[] second) {
        // Initialize an array to store the merged result
        int[] mix = new int[first.length + second.length];

        // Initialize indices for the two arrays and the merged array
        int i = 0;
        int j = 0;
        int k = 0;

        // Merge the elements from both arrays into the mix array
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Add any remaining elements from the first array
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Add any remaining elements from the second array
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        // Return the merged array
        return mix;
    }
}
