package leetcode;

public class SortColors {

    public static void sortColors(int[] nums) {
        int second = nums.length - 1, zero = 0;
        for (int i = 0; i <= second; i ++) {
            while (nums [i] == 2 && i < second) swap (nums, i, second --);
            while (nums [i] == 0 && i > zero) swap (nums, i, zero ++);
        }
    }

    private static void swap (int[] nums, int from, int to) {
        int val = nums [from];
        nums [from] = nums [to];
        nums [to] = val;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,0,1,1,2,2,2};
        sortColors(nums);
    }
}


