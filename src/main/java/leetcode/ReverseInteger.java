package leetcode;

public class ReverseInteger {

    public static int reverse(int x) {
        boolean neg = x < 0;
        if ( neg ) x = -1 * x;

        Long result = 0l;

        while ( x > 0 ){
            result = result * 10 + x % 10;
            x /= 10;
        }

        if ( result > Integer.MAX_VALUE) return 0;
        if( neg ) return -1 * result.intValue();
        else return result.intValue() ;
    }

    public static void main(String[] args) {
        int x = reverse(-2147483648);
        System.out.println(x);
    }
}
