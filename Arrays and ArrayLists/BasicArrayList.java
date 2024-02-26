import java.util.*;

public class BasicArrayList {
    public static void main(String[] args) {
        

        // Create an ArrayList of integers with an initial capacity of 5
        ArrayList<Integer> list = new ArrayList<>(5); 

        // // Add elements to the ArrayList
        list.add(67);
        list.add(678);
        list.add(5647);
        list.add(3477428);
        list.add(2462);

        // // Attempt to add another element to the ArrayList, which will exceed the initial capacity
        // // This will automatically resize the ArrayList to accommodate the new element
        list.add(6467);

        // Print the ArrayList
        System.out.println(list);
    }
}
