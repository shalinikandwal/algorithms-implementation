package leetcode;

import java.util.Arrays;

public class ThreeSumSmaller {
    static int count;

    public static int threeSumSmaller(int[] nums, int target) {
        count = 0;
        Arrays.sort(nums);
        int len = nums.length;

        for(int i=0; i<len-2; i++) {
            int left = i+1, right = len-1;
            while(left < right) {
                if(nums[i] + nums[left] + nums[right] < target) {
                    count += right-left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {-2,0,0,0,0,2};
        System.out.println(threeSumSmaller(nums, 2));

    }
}
