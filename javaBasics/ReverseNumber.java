public class ReverseNumber {

    public static int reversedigit(int n){
        int reversedNumber = 0;
        while(n != 0){
            int digit = n%10;
            reversedNumber = reversedNumber * 10 + digit;
            n = n / 10;
        }
        return reversedNumber;
    }
    public static void main(String[] args) {
        int i = 5678;
        System.out.println(reversedigit(i));
    }
}
