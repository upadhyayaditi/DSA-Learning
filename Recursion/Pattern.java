package Recursion;

public class Pattern {
    // Main method to demonstrate the triangle pattern
    public static void main(String[] args) {
        // Calling the trianglePattern method with the desired number of rows
        trianglePattern(4, 0);
    }

    // Method to print the triangle pattern recursively
    static void trianglePattern(int row, int column) {
        // Base case: If the row number becomes 0, terminate recursion
        if (row == 0) {
            return;
        }
        // Recursive case: If the column number is less than the current row number
        if (column < row) {
            // Print a star (*) and recursively call trianglePattern with the same row and
            // next column
            System.out.print("*");
            trianglePattern(row, column + 1);
        } else {
            // When the column exceeds the row, move to the next row and reset the column to
            // 0
            System.out.println();
            trianglePattern(row - 1, 0);
        }
    }
}
