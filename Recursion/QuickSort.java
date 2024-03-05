package Recursion;

import java.util.Arrays;

class QuickSort {
    public static void main(String[] args) {
        // Define an array to be sorted
        int[] arr = { 34, 56, 89, 10, 1, 5 };

        // Call the quickSort method to sort the array
        quickSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Method to perform quick sort on the array
    static void quickSort(int[] arr, int low, int high) {
        // Base case: If the partition has one or zero elements, return
        if (low >= high) {
            return;
        }

        // Choose the pivot element from the middle of the partition
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        // Partition the array around the pivot
        while (start <= end) {
            // Find element on the left side greater than the pivot
            while (arr[start] < pivot) {
                start++;
            }
            // Find element on the right side smaller than the pivot
            while (arr[end] > pivot) {
                end--;
            }

            // Swap elements to ensure left side has elements smaller than pivot
            // and right side has elements greater than pivot
            if (start <= end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // Recursively apply quick sort to the partitions on the left and right of the
        // pivot
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
