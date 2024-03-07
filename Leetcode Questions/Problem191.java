// https://leetcode.com/problems/number-of-1-bits/description/
public class Problem191 {
    public static void main(String[] args) {
        // Test data: a long integer number representing a binary value
        long num = 00000000000000000000000000001011; // In Java, leading zeros denote an octal literal, so this is equivalent to the decimal number 11
        System.out.println(hammingWeight(num));

    }

// Function to count the number of 1 bits (Hamming weight) in a long integer
static int hammingWeight(long n) {
        // Initialize a variable to store the count of 1 bits
        int count = 0;

        // Iterate over each bit (32 bits for a long integer in Java)
        for (int i = 0; i < 32; i++)
