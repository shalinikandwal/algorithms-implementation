package leetcode;

public class RotatedArray {

    public static int findMin(int[] nums) {

        int left = 0, right = nums.length - 1;

        while ( left < right ){
            if ( nums[left] < nums[right] ) return nums[left];

            int mid = (left + right) /2;
            if ( nums[mid] > nums[right] ) left = mid + 1;
            else right = mid;
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] num = {2,4,5,6,7,0,1};
        System.out.println( findMin(num));
    }
}
