package leetcode;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int begin = 0 ;
        for ( int i = 0; i< nums.length ; i++){
            if (nums[i] != val) nums[begin ++ ] = nums[i];
        }
        return begin;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,2,1};
        System.out.println( removeElement(nums, 2));
    }
}
