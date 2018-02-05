package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> collector = new ArrayList<>();
        collector.add(Arrays.asList());
        subsetsInner ( nums , collector , new ArrayList<>(), 0);
        return collector;
    }

    private static void subsetsInner (int[] nums , List<List<Integer>> collector , List<Integer> build, int index){

        for ( int i = index; i < nums.length; i ++){
            build.add (nums[i]);
            collector.add (new ArrayList<>(build));
            subsetsInner (nums, collector , build , i + 1);
            build.remove (build.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println( subsets(new int[]{1,2,3}));
    }
}
