public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 34, 1, 78, -9, 0 };
        selection(arr); // Call the selection sort method
        printing(arr); // Call the method to print the sorted array
    }

    // Method to perform selection sort
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Find the index of the maximum element in the unsorted part of the array
            int last = arr.length - i - 1;
            int max = getMaxElement(arr, 0, last);
            // Swap the maximum element with the last element in the unsorted part
            swap(arr, max, last);
        }
    }

    // Method to swap two elements in an array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Method to find the index of the maximum element in a given range
    static int getMaxElement(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    // Method to print the elements of an array
    static void printing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
