// https://leetcode.com/problems/sort-array-by-parity/description/

import java.util.Arrays;

public class Problem905 {
    public static void main(String[] args) {
        // Test data: an array of integers
        int[] arr = { 3, 1, 2, 4 };
        
        // Call the sortArrayByParity function and print the result
        int[] ans = sortArrayByParity(arr);
        System.out.println(Arrays.toString(ans));
    }

    // Function to sort an array of integers by parity (even or odd)
    static int[] sortArrayByParity(int[] nums) {
        // Initialize two pointers: left and right
        int left = 0;
        int right = nums.length - 1;

        // Loop until the left pointer is less than the right pointer
        while (left < right) {
            // Move the left pointer until it points to an odd number
            while (left < right && nums[left] % 2 == 0) {
                left++;
            }

            // Move the right pointer until it points to an even number
            while (left < right && nums[right] % 2 != 0) {
                right--;
            }

            // Swap the even and odd elements if left pointer is still less than right pointer
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        // R
