import java.util.*;

public class SmallestElementInArray {

    public static void main(String[] args) {
        int[] arr = {4, 0, -1, 9, 10, 8};

        System.out.println(sort(arr));
        
    }

    // static int minElement(int[] arr){

    //     int min = arr[0];
        
    //     for(int i = 0; i < arr.length; i++){
    //         if (min > arr[i]) {
    //             min = arr[i];
    //         }
    //     }

    //     return min;
    // }

    static int sort(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

}