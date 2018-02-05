package leetcode;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        if ( nums == null || nums.length == 0) return 0;
        int count = 1, majority = nums[0];

        for ( int i = 1 ; i< nums.length ; i ++){

            if ( nums[i] == majority)
                count ++;
            else count --;

            if ( count == 0) {
                majority = nums[i];
                count ++;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,3,2,4}));
    }
}
