package leetcode;

public class PeakElement {

    public static int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while ( low < high ){
            int mid1 = low + (high - low) / 2;
            int mid2 = mid1 + 1;
            if ( nums[mid1] < nums[mid2]) low = mid2 ;
            else high = mid1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,9,6,5};
        System.out.println(findPeakElement(nums));
    }
}
