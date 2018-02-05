package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> collector = new ArrayList<>();
        if (n > 0) combineInner ( collector , new ArrayList() , n , k, 1);
        return collector;

    }

    private static void combineInner (List<List<Integer>> collector,
                                      List<Integer> build, int n , int k, int index){

        if (build.size() >= k){
            collector.add (new ArrayList<>(build));
            return;
        }

        for ( int i = index ; i <= n ; i++){
            build.add (i);
            combineInner (collector, build, n , k , i + 1);
            build.remove (build.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
