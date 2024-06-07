// https://leetcode.com/problems/reverse-bits/

public class Problem190 {
    public static void main(String[] args) {
        // Test data: an integer number
        int num = 1111111;

        // Call the reverseBits function and print the result
        System.out.println(reverseBits(num));
    }

    // Function to reverse the bits of an integer
    static int reverseBits(int n) {
        // Initialize a variable to store the result
        int result = 0;

        // Iterate over each bit (32 bits in total for a 32-bit integer)
        for (int i = 0; i < 32; i++) {
            // Shift the result left by 1 bit
            result = result << 1;

            // Extract the last bit of the input number
            int lastBit = n & 1;

            // OR operation to set the last bit of the result
            result = result | lastBit;

            // Shift the input number to the right by 1 bit
            n = n >> 1;
        }

        // Return the result with reversed bits
        return result;
    }
}
