public class MaximumNo {
    public static void main(String[] args) {
        // Initialize an array with some numbers
        int[] arr = { 4, 5, 2, 47, 89, 34 };

        // Call the maxNumber method to find the maximum number in the array
        int max = maxNumber(arr);

        // Print the maximum number
        System.out.println(max);
    }

    // Method to find the maximum number in an array
    static int maxNumber(int[] arr) {
        // Initialize a variable to store the maximum number, initially set to the
        // minimum possible integer value
        int max = Integer.MIN_VALUE;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is greater than the current maximum
            if (max < arr[i]) {
                // If so, update the maximum
                max = arr[i];
            }
        }

        // Return the maximum number found in the array
        return max;
    }
}
