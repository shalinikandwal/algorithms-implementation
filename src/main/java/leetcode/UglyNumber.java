package leetcode;

public class UglyNumber {

    public boolean isUgly(int num) {
        if (num > 0)
            for (int i : new int[] { 2, 3, 5 }) {
                while (num % i == 0) {
                    num /= i;
                }
            }
        return num == 1;
    }
}
