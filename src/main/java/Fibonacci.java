public class Fibonacci {
    public static long fibonacci(long n) {
    // recursion case: cool, but inefficient
        // base case: if 0 or 1, return n
                if (n == 0 || n == 1) {
                    return n;
                }
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
    // linear case: less cool, but wayy faster
//        if (n == 0) {
//            return 0;
//        }
//        long small = 0;
//        long large = 1;
//        for (int i = 2; i <= n; i++) {
//            long temp = large;
//            large = small + large;
//            small = temp;
//        }
//        return large;
//}
//
}

