public class TrappingWater {
    // Method to calculate the amount of trapped water
    public static int trap(int[] height){
        int n = height.length;
        
        // Array to store the maximum height of bars to the left of each bar
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        // Calculate the maximum height of bars to the left of each bar
        for(int i=1; i<n; i++ ){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // Array to store the maximum height of bars to the right of each bar
        int[] rightmax = new int[n];
        rightmax[n-1] = height[n-1];
        // Calculate the maximum height of bars to the right of each bar
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }
        
        // Variable to store the total trapped water
        int trappedWater = 0;

        // Calculate the trapped water for each bar
        for(int i=0; i<n; i++){
            // Calculate the water level for the current bar
            int waterLevel = Math.min(leftmax[i], rightmax[i]);
            // Calculate the trapped water for the current bar
            trappedWater += waterLevel - height[i];
        }
        
        return trappedWater; // Return the total trapped water
    }

    public static void main(String[] args) {
        // Test case
        int height[] = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height)); // Print the result
    }
}
