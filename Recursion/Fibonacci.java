public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change the value of n to find different Fibonacci numbers
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));
    }

    // Recursive method to find the nth Fibonacci number
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        // The Fibonacci sequence is defined as the sum of the previous two numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
