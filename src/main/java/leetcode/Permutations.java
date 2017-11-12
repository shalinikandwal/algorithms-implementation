package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) return Arrays.asList();
        List<List<Integer>> ans = new ArrayList<>(); // collector
        dfs (ans, 0, nums);
        return ans;
    }

    // recursive program
    private static void dfs (List<List<Integer>> ans, int start, int [] nums) {
        if (start >= nums.length) { // base condition
            List<Integer> res = new ArrayList<>(); // record the mutation through the path in collector
            for (int num : nums) res.add (num);
            ans.add (res);
        } else {
            for (int idx = start; idx < nums.length; idx ++) {
                // do
                swap (nums, idx, start); // next iteration

                dfs (ans, start + 1, nums);

                // undo
                swap (nums, idx, start);
            }
        }
    }

    private static void swap (int [] nums, int from, int to) {
        int num = nums [from];
        nums [from] = nums [to];
        nums [to] = num;
    }

    public static void main(String[] args) {
        int[] nums = { 1,2,3};
        System.out.println(permute(nums));
    }
}
