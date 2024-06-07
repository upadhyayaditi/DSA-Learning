// https://leetcode.com/problems/contains-duplicate/


import java.util.Arrays;

public class Problem217 {
    public boolean containsDuplicate(int[] nums) {
    // If there's only one element in the array, it cannot have duplicates
    if (nums.length == 1) {
        return false;
    }

    // Sort the array in ascending order
    Arrays.sort(nums);

    // Iterate through the sorted array
    for (int i = 0; i < nums.length - 1; i++) {
        // If adjacent elements are equal, the array contains a duplicate
        if (nums[i] == nums[i + 1]) {
            return true;
        }
    }

    // If no duplicates are found, return false
    return false;
}

}
