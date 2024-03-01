public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 1, 4 };
        cyclic(arr); // Call the cyclic sort method
        printing(arr); // Call the method to print the sorted array
    }

    // Method to perform cyclic sort
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // Calculate the correct index for the current element
            if (arr[i] != arr[correct]) { // Check if the element is not at its correct position
                swap(arr, i, correct); // Swap the current element with its correct position
            } else {
                i++; // Move to the next element if the current one is already at its correct
                     // position
            }
        }
    }

    // Method to swap two elements in an array
    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

    // Method to print the elements of an array
    static void printing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
