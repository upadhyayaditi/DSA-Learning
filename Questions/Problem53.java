// https://leetcode.com/problems/maximum-subarray/description/
public class Problem53 {
    public static void main(String[] args) {
        // Test data: an array of integers
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // Call the maxSubArray function and print the result
        System.out.println(maxSubArray(arr));
    }

    // Function to find the maximum sum of contiguous subarray
    static int maxSubArray(int[] nums) {
        // Initialize variables to keep track of maximum sum and current sum
        int maxSum = Integer.MIN_VALUE; // Start with the smallest possible integer
        int currSum = 0; // Start with sum 0

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the current sum
            currSum += nums[i];

            // Update the maximum sum if the current sum is greater
            if (currSum > maxSum) {
                maxSum = currSum;
            }

            // If the current sum becomes negative, reset it to 0
            if (currSum < 0) {
                currSum = 0;
            }
        }

        // Return the maximum sum found
        return maxSum;
    }
}
