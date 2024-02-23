package javaBasics;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        // Convert integer to string
        String str = Integer.toString(x);
        
        // Use two pointers to check for palindrome
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

       
}
