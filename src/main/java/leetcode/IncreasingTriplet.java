package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IncreasingTriplet {

    public static boolean increasingTriplet(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int res = 0;
            for (Integer key : map.keySet())
                if (key < num)
                    res = Math.max (res, map.get (key) + 1);
            if (res >= 2) return true;
            map.put (num, res);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1,2,0,3}));
    }
}
