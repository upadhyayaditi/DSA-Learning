import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        // Create a 2D array of size 3x3
        int[][] arr = new int[3][3];

        // Create a Scanner object to read input from the console
        Scanner in = new Scanner(System.in);

        // Input values into the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt(); // Read an integer input and assign it to the current element of the array
            }
        }

        // Print the 2D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " "); // Print the current element of the array followed by a space
            }

            System.out.println(); // Move to the next line after printing each row of the array
        }

    }
}
