package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Test array
        int[] arr = { 34, 67, 2, 78, 99 };

        // Call the recursive bubble sort method
        bubbleSort(arr, 0, arr.length - 1);

        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    // Recursive bubble sort method
    static void bubbleSort(int[] arr, int start, int end) {
        // Base case: if there is only one element or no elements to sort, return
        if (end == 0) {
            return;
        }

        // Recursive case: if there are elements to sort
        if (start < end) {
            // Compare adjacent elements and swap if necessary
            if (arr[start] < arr[start + 1]) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

            // Continue sorting the rest of the array
            bubbleSort(arr, start + 1, end);
        } else {
            // Continue sorting the remaining unsorted portion of the array
            bubbleSort(arr, start, end - 1);
        }
    }
}
