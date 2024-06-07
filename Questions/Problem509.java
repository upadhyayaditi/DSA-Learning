// https://leetcode.com/problems/fibonacci-number/description/

public class Problem509 {
    public int fib(int n) {
        // Base cases: if n is 1 or 2, return 1 (as these are the first two Fibonacci numbers)
        if (n == 1 || n == 2) {
            return 1;
        }
        // Base case: if n is 0, return 0 (as Fibonacci sequence starts with 0)
        if (n == 0) {
            return n;
        }
        
        // Recursive case: return the sum of the previous two Fibonacci numbers
        return fib(n - 1) + fib(n - 2);
    }
    
}
