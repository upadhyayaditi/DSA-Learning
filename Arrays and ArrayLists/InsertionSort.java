public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 67, 3, 1, 0, 56 };
        insertion(arr); // Call the insertion sort method
        printing(arr); // Call the method to print the sorted array
    }

    // Method to perform insertion sort
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) { // Compare current element with previous one
                    swap(arr, j, j - 1); // Swap if current element is smaller
                } else {
                    break; // Break out of the inner loop if no more swaps needed
                }
            }
        }
    }

    // Method to swap two elements in an array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Method to print the elements of an array
    static void printing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
