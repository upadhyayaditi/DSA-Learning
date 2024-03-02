package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 23, 45, 56, 78, 99 };
        int target = 78;

        // Call the binarySearch method to find the index of the target element
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(result); // Print the index of the target element (or -1 if not found)
    }

    // Recursive binary search method
    static int binarySearch(int[] arr, int target, int start, int end) {
        // Base case: If the start index is greater than the end index, the target
        // element is not found
        if (start > end) {
            return -1;
        }

        // Calculate the mid index
        int mid = start + (end - start) / 2;

        // If the target element is found at the mid index, return the mid index
        if (target == arr[mid]) {
            return mid;
        }

        // If the target element is less than the element at the mid index, search in
        // the left half
        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }

        // If the target element is greater than the element at the mid index, search in
        // the right half
        return binarySearch(arr, target, mid + 1, end);
    }
}
