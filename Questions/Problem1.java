// https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;

class Problem1 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int[] indices = twoSum(nums, 9);
        System.out.println(Arrays.toString(indices));
    }

    static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Iterate through the remaining elements to find the complement
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the current pair sums up to the target
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    // Return the indices of the two numbers
                    return indices;
                }
            }
        }
        // If no solution is found, return an empty array
        return indices;
    }
}