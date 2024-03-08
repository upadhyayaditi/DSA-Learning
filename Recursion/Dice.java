package Recursion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        // Call the diceThrow method with a target value of 4 and an empty prefix
        System.out.println(diceThrow(4, ""));
    }

    static ArrayList<String> diceThrow(int target, String p) {
        // Base case: If the target value is 0, create a new ArrayList and add the
        // current combination
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Create a new ArrayList to store combinations
        ArrayList<String> list = new ArrayList<>();

        // Iterate over possible outcomes of throwing a dice (1 to 6), limited by the
        // target value
        for (int i = 1; i <= 6 && i <= target; i++) {
            // Recursively call diceThrow with the reduced target value and the updated
            // prefix
            list.addAll(diceThrow(target - i, p + i));
        }

        // Return the list of combinations
        return list;
    }
}
