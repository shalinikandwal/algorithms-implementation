package leetcode;

public class LongestwithK {

    public static int longestSubstring(String s, int k) {
        int [] map = new int [256];
        for (char ch : s.toCharArray()) map [ch] ++;
        for (int idx = 0, ans = 0; idx < s.length(); idx ++)
            if (map [s.charAt (idx)] < k) {
                for (String str : s.split (String.valueOf (s.charAt (idx))))
                    ans = Math.max (ans, longestSubstring (str, k));
                return ans;
            }
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("aaadbbbcccc", 3));
    }
}



