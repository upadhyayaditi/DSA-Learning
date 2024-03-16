package HashMap;

// Importing required classes from the Java standard library
import java.util.*;

// Declaring a class named FirstRepeatedCharacter in the package HashMap
class FirstRepeatedCharacter {
    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Creating a HashMap to store character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();
        
        // Input string
        String str = "agreenapple";

        // Iterating through each character in the input string
        for (char ch : str.toCharArray()) {
            // Checking if the character is already present in the frequency map
            if (freqMap.containsKey(ch)) {
                // If present, incrementing its frequency count
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                // If not present, adding the character with frequency count 1
                freqMap.put(ch, 1);
            }
        }

        // Iterating through each character in the input string again
        for (char ch : str.toCharArray()) {
            // Finding the first character with frequency count greater than 1
            if (freqMap.get(ch) > 1) {
                // Printing the first repeated character
                System.out.println("First repeated character: " + ch);
                // Exiting the loop after finding the first repeated character
                break;
            }
        }

        // Printing the frequency map
        System.out.println("Character frequencies: " + freqMap);
    }
}
