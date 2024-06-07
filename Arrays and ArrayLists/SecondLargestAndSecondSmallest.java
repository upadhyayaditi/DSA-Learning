import java.util.Arrays;

class SecondLargestAndSecondSmallest {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 8, 9, 10, 8, 14};

        System.out.println(Arrays.toString(getSecondOrderElements(arr)));
        
    }

    static int[] getSecondOrderElements(int []a) {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        int smallest = Integer.MAX_VALUE;
        int ssmallest = Integer.MAX_VALUE;


        for (int i = 0; i < a.length; i++) {
            if (a[i] >  largest) {
                slargest = largest;
                largest = a[i];
            }else if(a[i] < largest && a[i] > slargest){
                slargest = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest ) {
                ssmallest = smallest;
                smallest = a[i];
            }else if(a[i] > smallest && a[i] < ssmallest){
                ssmallest = a[i];
            }
        }

        int[] res = {slargest, ssmallest};
        return res;
    }
}
