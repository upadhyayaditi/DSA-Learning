

class FactorialNumber{
    public static void main(String args[]){
        int number = 5;
        int result = factorial(number);

        System.out.println("Factorial :" + result);

    }

    static int factorial(int n){
        if( n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n - 1);
        }
    }
}