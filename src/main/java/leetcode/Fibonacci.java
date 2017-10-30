package leetcode;

public class Fibonacci {

    public static void main(String [] args) {
        // 0 1 1 2 3 5
        long s = System.currentTimeMillis();
        System.out.println (returnFibReSmart(10));
        System.out.println("time : " + (System.currentTimeMillis() - s));
    }

    // iterative
    public static int returnFib (int n) {
        int first = 0, second = 1;
        for ( int i = 2; i<=n ; i++) {
            int res = first + second;
            first = second;
            second = res;
        }
        return second;
    }

    // recursive
    public static int returnFibRe (int n) {
        if (n == 0) return 0;
        return returnFibRe(n - 1) + returnFibRe(n - 2);
    }

    // recursive (Smart)
    public static int returnFibReSmart (int n) {
        // setup
        Integer [] memo = new Integer [n + 1];
        memo [0] = 0; memo [1] = 1;
        return dp (memo, n);
    }

    // actual work
    private static int dp  (Integer [] memo, int n) {
        if (memo [n] != null) return memo [n];

        int ans = dp (memo, n - 1) + dp (memo,n - 2);
        memo [n] = ans;
        return memo [n];
    }
}
