package leetcode;

/**
 *485. Max Consecutive Ones

 Given a binary array, find the maximum number of consecutive 1s in this array.
 */
public class MaxConsecOnes {
    /**
     *Find max consecutive ones
     * @param nums
     * @return
     */
    public int findMaxXOnsecutiveOnes(int[] nums){
        int count = 0;
        int result = 0;

        for (int i = 0; i< nums.length ; i++){
            if(nums[i] == 0)
                count =0;
            else
                count++;
                result = Math.max(result, count);

        }
        return result;
    }
}
