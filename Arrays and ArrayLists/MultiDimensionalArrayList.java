import java.util.*;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner in = new Scanner(System.in);

        // Create an ArrayList to store ArrayLists of integers (2D ArrayList)
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Add 3 ArrayLists to the 2D ArrayList to represent rows
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Input values into the 2D ArrayList
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Input an integer value and add it to the appropriate ArrayList in the 2D
                // ArrayList
                list.get(i).add(in.nextInt());
            }
        }

        // Print the 2D ArrayList
        System.out.println(list);

        // Close the Scanner object to release system resources
        in.close();
    }
}
