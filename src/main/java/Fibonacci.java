public class Fibonacci {
    public static long fibonacci(long n) {
        // base case: if 0 or 1, return n
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

