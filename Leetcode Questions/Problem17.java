// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;

public class Problem17 {

    public static void main(String[] args) {
        // Calling the letterCombinations method with a numeric string and an empty
        // prefix
        System.out.println(letterCombinations("12", ""));
    }

    static ArrayList<String> letterCombinations(String up, String p) {
        // Base case: If the string is empty, create a new ArrayList and add the current
        // combination
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Extract the numeric value of the first digit in the input string
        int digit = up.charAt(0) - '0';

        // Create a new ArrayList to store combinations
        ArrayList<String> list = new ArrayList<>();

        // Iterate over the characters corresponding to the numeric digit and generate
        // combinations
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            // Convert the numeric offset to a character ('a' + offset)
            char ch = (char) ('a' + i);

            // Recursively call letterCombinations with the remaining digits and the updated
            // prefix
            list.addAll(letterCombinations(up.substring(1), p + ch));
        }

        // Return the list of combinations
        return list;
    }
}
