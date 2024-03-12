// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class Problem26 {
    public int removeDuplicates(int[] nums) {
        // Check if the array is empty
        if (nums.length == 0) return 0;
        
        int k = 1; // k represents the index of the last unique element
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous unique element
            if (nums[i] != nums[k - 1]) {
                nums[k++] = nums[i]; // Found a new unique element, so update nums array
            }
        }
        
        // Return the count of unique elements (represented by the index k)
        return k;
    }
    
}
