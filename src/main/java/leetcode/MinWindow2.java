package leetcode;

public class MinWindow2 {

    public static String minWindow(String s, String t) {
        int [] map = new int [256];
        for (char ch : t.toCharArray()) map [ch] ++;

        int start = 0, end = 0, d = Integer.MAX_VALUE, counter = 0, head = 0;
        while (end < s.length ()) {
            if (map [s.charAt (end ++)] -- > 0) counter ++;
            while (counter == t.length()) {
                if (end - start < d) d = end - (head = start);
                if (map [s.charAt (start ++)] ++ == 0) counter --;
            }
        }
        return (d == Integer.MAX_VALUE) ? "" : s.substring (head, head + d);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}
