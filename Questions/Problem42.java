// https://leetcode.com/problems/trapping-rain-water/

public class Problem42 {
    public int trap(int[] height) {
        // Get the length of the height array
        int n = height.length;
        
        // Create an array to store the maximum height encountered from the left side
        int[] leftmax = new int[n];
        leftmax[0] = height[0]; // Initialize the leftmost element
        
        // Iterate from the second element to the end of the array
        for(int i = 1; i < n; i++) {
            // Calculate the maximum height encountered so far from the left side
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
    
        // Create an array to store the maximum height encountered from the right side
        int[] rightmax = new int[n];
        rightmax[n - 1] = height[n - 1]; // Initialize the rightmost element
        
        // Iterate from the second last element to the beginning of the array
        for(int i = n - 2; i >= 0; i--) {
            // Calculate the maximum height encountered so far from the right side
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        
        // Initialize variable to store trapped water
        int trappedWater = 0;
    
        // Iterate through each element of the height array
        for(int i = 0; i < n; i++) {
            // Calculate the water level at the current position
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            // Calculate the trapped water at the current position
            trappedWater += waterLevel - height[i];
        }
        
        // Return the total trapped water
        return trappedWater;
    }
    
}
