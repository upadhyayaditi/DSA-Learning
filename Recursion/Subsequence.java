package Recursion;

class Subsequence {
    public static void main(String[] args) {
        // Calling the subsequence method with an initial string and an empty prefix
        subseq("abc", " ");
    }

    static void subseq(String up, String p) {
        // Base case: If the string is empty, print the prefix and return
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        // Extract the first character from the remaining string
        char ch = up.charAt(0);

        // Recursive call with the first character included in the prefix
        subseq(up.substring(1), p + ch);
        // Recursive call without including the first character in the prefix
        subseq(up.substring(1), p);
    }
}
