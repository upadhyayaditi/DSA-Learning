public class MinimumNo {
    public static void main(String[] args) {
        // Initialize an array with some numbers
        int[] arr = { 34, 56, 23, 1, 5, 0 };

        // Call the minimumNo method to find the minimum number in the array
        int min = minimumNo(arr);

        // Print the minimum number
        System.out.println(min);
    }

    // Method to find the minimum number in an array
    static int minimumNo(int[] arr) {
        // Initialize a variable to store the minimum number, initially set to the
        // maximum possible integer value
        int min = Integer.MAX_VALUE;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is smaller than the current minimum
            if (min > arr[i]) {
                // If so, update the minimum
                min = arr[i];
            }
        }

        // Return the minimum number found in the array
        return min;
    }
}
