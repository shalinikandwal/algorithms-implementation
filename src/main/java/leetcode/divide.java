package leetcode;

public class divide {

    public static int divide(int dividend, int divisor) {

            int sign = 1;

            if (( dividend < 0 && divisor > 0 ) || (dividend > 0 && divisor < 0)) sign = -1;

            long ldividend = Math.abs((long) dividend);
            long ldivisor = Math.abs((long) divisor);

        if ( divisor == 0 ) return Integer.MAX_VALUE;
        if( dividend == 0 || dividend < divisor ) return 0;
            long lans = divide ( ldividend , ldivisor);
            int ans = 0;
            if ( lans > Integer.MAX_VALUE)
                ans = (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            else ans = (int) (sign * lans);

            return ans;
        }

        private static long divide ( long ldividend , long ldivisor ){
            if ( ldividend < ldivisor ) return 0;
            long sum = ldivisor;
            long multiple = 1;

            while ( (sum + sum ) <= ldividend) {
                sum += sum;
                multiple += multiple;
            }

            return multiple + divide (ldividend - sum, ldivisor);
        }

    public static void main(String[] args) {
        System.out.println( "Division : " + divide( -1, 1));
    }

}
