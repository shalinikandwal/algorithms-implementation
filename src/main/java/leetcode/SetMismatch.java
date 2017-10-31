package leetcode;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - 1 != i && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - 1 != i) {
                result[0] = nums[i];
                result[1] = i + 1;
                break;
            }
        }

        return result;
    }

    private static void swap (int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] error = findErrorNums(new int[]{1,2,4,3,3});

        for( int i = 0; i< error.length ; i++){
            System.out.println( error[i]);
        }
    }
}
