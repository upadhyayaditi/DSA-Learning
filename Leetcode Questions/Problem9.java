// https://leetcode.com/problems/palindrome-number/description/

public class Problem9 {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));

    }

    // Function to check if a given integer is a palindrome
    static boolean isPalindrome(int x) {
        // Convert the integer to a string
        String str = Integer.toString(x);

        // Initialize pointers for the leftmost and rightmost characters
        int left = 0;
        int right = str.length() - 1;

        // Loop until the pointers meet in the middle
        while (left < right) {
            // Compare characters at the left and right pointers
            if (str.charAt(left) != str.charAt(right)) {
                // If characters don't match, the integer is not a palindrome
                return false;
            }
            // Move the pointers towards the middle
            left++;
            right--;
        }

        // If the loop completes without returning false, the integer is a palindrome
        return true;
    }
}
