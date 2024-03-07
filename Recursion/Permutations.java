package Recursion;

public class Permutations {
    public static void main(String[] args) {
        // Calling the permutation method with an initial string and an empty prefix
        permutation("abc", "");
    }

    static void permutation(String up, String p) {
        // Base case: If the string is empty, print the current permutation and return
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        // Extract the first character from the remaining string
        char ch = up.charAt(0);

        // Iterate over all positions to insert the current character into the prefix
        for (int i = 0; i <= p.length(); i++) {
            // Split the prefix into two parts: before and after the current position
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());

            // Recursively call permutation with the remaining characters and the updated
            // prefix
            permutation(up.substring(1), first + ch + second);
        }
    }
}
