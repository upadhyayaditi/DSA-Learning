public class ReverseArray {
    public static void main(String[] args) {
        // Initialize an array with some numbers
        int[] arr = { 34, 78, 2, 5, 3, 23 };

        // Print the original array
        printing(arr);

        // Reverse the array
        reverseArray(arr);

        // Print the reversed array
        printing(arr);
    }

    // Method to reverse the array
    static void reverseArray(int[] a) {
        int start = 0; // Start index of the array
        int end = a.length - 1; // End index of the array

        // Swap elements starting from the two ends and moving towards the middle
        while (start < end) {
            // Call the swap method to swap elements at start and end indices
            swap(a, start, end);
            start++; // Move the start index towards the middle
            end--; // Move the end index towards the middle
        }
    }

    // Method to swap two elements in the array
    static void swap(int[] a, int start, int end) {
        int temp = a[start]; // Store the value of the element at start index in a temporary variable
        a[start] = a[end]; // Assign the value of the element at end index to the element at start index
        a[end] = temp; // Assign the value stored in the temporary variable to the element at end index
    }

    // Method to print the array
    static void printing(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]); // Print each element of the array
        }
    }
}
