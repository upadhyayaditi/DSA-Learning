import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {67, 89, 1000, 58, 34};

        System.out.println(sort(arr));
    }

    static int sort(int[] nums){
        Arrays.sort(nums);

        return nums[nums.length - 1];
    }
}
