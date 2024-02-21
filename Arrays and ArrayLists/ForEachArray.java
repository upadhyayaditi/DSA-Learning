// Scanner Class imported
import java.util.Scanner;

public class ForEachArray {
    public static void main(String[] args) {
        // Declare an array to store integers
        int[] numbers;

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array with the specified size
        numbers = new int[size];

        // Ask the user to enter values for the array
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            // Read each integer input from the user and store it in the array
            numbers[i] = scanner.nextInt();
        }

        // Print the elements of the array using a for-each loop
        System.out.println("Array elements:");
        for (int number : numbers) {
            // Print each element of the array
            System.out.println(number);
        }

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
