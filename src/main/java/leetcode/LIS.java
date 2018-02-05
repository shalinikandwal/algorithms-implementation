package leetcode;

public class LIS {

    public static int lengthOfLIS(int[] nums) {
        if ( nums == null) return 0;

        int[] array = new int[nums.length];

        int globalMax = 0;
        for (int idx =0; idx < nums.length ; idx ++) {
            int max = 1;
            for (int jdx = 0 ; jdx < idx ; jdx ++) {
                if (nums[jdx] < nums[idx]) {  // smaller
                    max = Math.max ( max, array[jdx] + 1);
                }
            }
            array[idx] = max;
            globalMax = Math.max (globalMax, max);
        }
        return globalMax;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10, 9, 2,5,6,19,5}));
    }
}
