

 class BinarySearch {
    public static void main(String args[]){
        int arr[] = {4, 5, 78, 8, 9, 12};
        int target = 78;
        int index = BinarySearch(arr, target);
        System.out.println(target + " is in the index of " + index);
    }   
    
    static int BinarySearch(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return -1;
    }
}
