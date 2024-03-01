public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 45, 21, 78, 1, 9 };
        bubble(arr); // Call the bubble sort method
        printing(arr); // Call the method to print the sorted array
    }

    // Method to perform bubble sort
    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Iterate through the array from index 1 to n - i
            // where n is the length of the array and i is the current iteration
            for (int j = 1; j < arr.length - i; j++) {
                // Compare adjacent elements and swap if they are in the wrong order
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j]; // Store current element in temp variable
                    arr[j] = arr[j - 1]; // Move larger element to the right
                    arr[j - 1] = temp; // Move smaller element to the left
                }
            }
        }
    }

    // Method to print the elements of an array
    static void printing(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
