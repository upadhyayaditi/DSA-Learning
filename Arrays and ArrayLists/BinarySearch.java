public class BinarySearch {
    public static void main(String[] args) {
        // Initialize an array with some numbers (sorted in ascending order)
        int[] arr = { 200, 45, 56, 78, 89, 100, 120, 150, 170 };

        // Call the binarySearch method to find the index of the target number 89
        int a = binarySearch(arr, 89);

        // Print the index where the target number is found in the array
        System.out.println(a);
    }

    // Method to check if the array is in ascending order
    static boolean isAsc(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Check if the start index is less than the end index
        if (start < end) {
            return true; // If true, the array is in ascending order
        } else {
            return false; // If false, the array is not in ascending order
        }
    }

    // Method to perform binary search in the array
    static int binarySearch(int[] arr, int target) {
        int start = 0; // Start index of the array
        int end = arr.length - 1; // End index of the array
        int mid; // Mid index of the array

        // Check if the array is in ascending order
        if (isAsc(arr)) {
            // Binary search in ascending order
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid; // Return the index of the target element
                }
            }
        } else {
            // Binary search in descending order
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid; // Return the index of the target element
                }
            }
        }

        return -1; // Return -1 if the target element is not found in the array
    }
}
