public class LinearSearch {
    public static void main(String[] args) {
        // Initialize an array with some numbers
        int[] arr = { 532, 13, 46, 22, 45, 24, 78 };

        // Call the linearSearch method to find the index of the target number 45
        int index = linearSearch(arr, 45);

        // Print the index where the target number is found in the array
        System.out.println(index);
    }

    // Method to perform linear search in an array
    static int linearSearch(int[] arr, int target) {
        // Check if the array is empty
        if (arr.length == 0) {
            return -1; // If empty, return -1 indicating target not found
        } else {
            // Iterate through the array to search for the target element
            for (int i = 0; i < arr.length; i++) {
                // Check if the current element is equal to the target
                if (target == arr[i]) {
                    return i; // If found, return the index of the target element
                }
            }
            return -1; // If target not found after iterating through the array, return -1
        }
    }
}
