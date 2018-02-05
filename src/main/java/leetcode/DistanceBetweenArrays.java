package leetcode;

import java.util.ArrayList;
import java.util.List;

public class DistanceBetweenArrays {

    public static int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size() - 1);

        for ( int i = 1; i < arrays.size() ; i ++){
            min = Math.min (min , arrays.get(i).get(0));
            max = Math.max (max , arrays.get(i).get (arrays.get(i).size() - 1));

        }
        return max - min;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(5);
        List<List<Integer>> result = new ArrayList<>();
        result.add(list);
        result.add(list2);
        System.out.println(maxDistance(result));
    }
}
