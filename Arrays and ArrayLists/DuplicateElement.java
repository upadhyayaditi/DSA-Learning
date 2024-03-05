import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = { 0 };
        System.out.println(duplicate(arr));
    }

    static boolean duplicate(int[] arr) {
        if (arr.length == 1) {
            return false;
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
