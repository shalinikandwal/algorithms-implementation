package leetcode;

public class powx {
    public static double myPow ( double x, int n){

        double result = 1.0;

        for (int i = n; i !=0; i /=2, x *=x)
            if ( i % 2 != 0 )
                result *= x;
        return n < 0 ? 1/ result : result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 11));
    }
}
