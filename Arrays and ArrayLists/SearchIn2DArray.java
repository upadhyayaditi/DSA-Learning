public class SearchIn2DArray {
    public static void main(String[] args) {
        // Test data: a 2D array
        int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };

        // Call the searchMatrix function with target value 10
        System.out.println(searchMatrix(arr, 10));
    }

    // Function to search for a target value in a 2D array
    static boolean searchMatrix(int[][] matrix, int target) {
        // Check for edge cases: empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;

        // Get the number of rows and columns in the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Initialize pointers for binary search
        int low = 0;
        int high = rows * cols - 1;

        // Binary search loop
        while (low <= high) {
            // Calculate the middle index
            int mid = low + (high - low) / 2;

            // Calculate row and column indices corresponding to the middle index
            int midRow = mid / cols;
            int midCol = mid % cols;

            // Get the element at the middle index
            int midElement = matrix[midRow][midCol];

            // Check if the middle element is the target
            if (midElement == target)
                return true;
            // If the middle element is less than the target, search in the right half
            else if (midElement < target)
                low = mid + 1;
            // If the middle element is greater than the target, search in the left half
            else
                high = mid - 1;
        }

        // If the target is not found, return false
        return false;
    }
}
