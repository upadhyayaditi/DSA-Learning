import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = { 0 };
        System.out.println(duplicate(arr)); // Output: false, only one element in the array
    }

    // Function to check if there are any duplicate elements in the array
    static boolean duplicate(int[] arr) {
        if (arr.length == 1) { // If array has only one element, return false
            return false;
        }
        Arrays.sort(arr); // Sort the array in ascending order

        // Iterate through the sorted array and check for adjacent duplicate elements
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) { // If adjacent elements are equal, return true
                return true;
            }
        }
        return false; // If no duplicates found, return false
    }
}
