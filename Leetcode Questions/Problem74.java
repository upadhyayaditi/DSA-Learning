//https://leetcode.com/problems/search-a-2d-matrix/

public class Problem74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        
        // Get the number of rows and columns in the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Initialize variables for binary search
        int low = 0;
        int high = rows * cols - 1;
        
        // Binary search loop
        while (low <= high) {
            // Calculate the middle index
            int mid = low + (high - low) / 2;
            // Calculate the row and column index of the middle element
            int midRow = mid / cols;
            int midCol = mid % cols;
            // Get the value of the middle element
            int midElement = matrix[midRow][midCol];
            
            // Check if the middle element is equal to the target
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
