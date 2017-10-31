package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
public class MergeIntervals {

    public static void main(String[] args) {
        Interval arr[] =  { new Interval(6,8), new Interval(1,9), new Interval(2,4), new Interval(4,7)};
        List<Interval> list = merge(Arrays.asList(arr));
        for (int i = 0 ; i < list.size() ; i++)
        System.out.println(list.get(i).start + " " + list.get(i).end);
    }

    public static List<Interval> merge(List<Interval> intervals) {
        Collections.sort (intervals,  (a, b) -> a.start -b.start);
        List<Interval> ans = new ArrayList<>();
        for (int idx = 0; idx < intervals.size(); idx ++) {
            int start = intervals.get (idx).start, end = intervals.get (idx).end;
            while (idx + 1 < intervals.size() && intervals.get (idx + 1).start <= end)
                end = Math.max (end, intervals.get (++ idx).end);
            ans.add (new Interval (start, end));
        }
        return ans;
    }
}
