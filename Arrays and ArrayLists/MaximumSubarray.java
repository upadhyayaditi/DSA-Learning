class MaximumSubarray {
    public static void main(String[] args) {
        // Array initialization
        int[] arr = { 5, 4, -1, 7, 8 };

        // Finding and printing the maximum subarray sum
        System.out.println(maxSubArray(arr));
    }

    // Function to find the maximum subarray sum
    static int maxSubArray(int[] nums) {
        // Initialize the maximum sum to the smallest possible integer value
        int maxSum = Integer.MIN_VALUE;
        // Initialize the current sum to 0
        int currSum = 0;

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Add the current element to the current sum
            currSum += nums[i];
            // If the current sum is greater than the maximum sum encountered so far,
            // update the maximum sum
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            // If the current sum becomes negative, reset it to 0 because a negative
            // sum cannot contribute to the maximum subarray sum
            if (currSum < 0) {
                currSum = 0;
            }
        }
        // Return the maximum subarray sum
        return maxSum;
    }
}
