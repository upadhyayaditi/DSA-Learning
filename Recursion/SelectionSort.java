package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 78, 0, 99, 6, 100, 170 };
        selectionSort(arr, 0, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    // Recursive method to perform selection sort
    static void selectionSort(int[] arr, int max, int start, int end) {
        // Base case: if there are no elements to sort, return
        if (end == 0) {
            return;
        }
        // Recursive case: if there are elements to sort
        if (start < end) {
            // Check if current element is greater than current maximum element
            if (arr[max] < arr[start]) {
                // If yes, update the index of maximum element
                selectionSort(arr, start, start + 1, end);
            } else {
                // If no, continue with the next element
                selectionSort(arr, max, start + 1, end);
            }
        } else {
            // Swap the maximum element with the last element
            int temp = arr[max];
            arr[max] = arr[end - 1];
            arr[end - 1] = temp;
            // Recursively sort the remaining array
            selectionSort(arr, 0, 0, end - 1);
        }
    }
}
