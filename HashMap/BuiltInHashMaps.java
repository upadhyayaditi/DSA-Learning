package HashMap;

// Importing required classes from the Java standard library
import java.util.HashMap;
import java.util.Map;

// Declaring a class named BuiltInHashMaps in the package HashMap
public class BuiltInHashMaps {
    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Creating a HashMap object with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the HashMap
        map.put(1, "Abhishek");
        map.put(2, "Aditi");
        map.put(3, "Rohit");
        map.put(4, "Virat");

        // Printing the HashMap
        System.out.println("HashMap Contents: " + map);

        // Retrieving and printing the value associated with key 4
        System.out.println("Value associated with key 4: " + map.get(4));

        // Attempting to retrieve the value associated with a non-existing key (key 8)
        System.out.println("Value associated with key 8 (not found): " + map.get(8));

        // Removing the key-value pair associated with key 3 from the HashMap
        map.remove(3);

        // Printing the HashMap after removing the key-value pair
        System.out.println("HashMap Contents after removing key 3: " + map);
    }
}
