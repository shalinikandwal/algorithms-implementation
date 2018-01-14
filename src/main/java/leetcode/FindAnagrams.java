package leetcode;

import java.util.*;

public class FindAnagrams {

        public static List<Integer> findAnagrams(String s, String p) {
            int [] freq = new int [256];
            for (char c : p.toCharArray()) freq [c] ++;

            List<Integer> ans = new ArrayList<>();
            int len = p.length();

            for (int idx = 0, start = 0; idx < s.length(); idx ++) {
                char ch = s.charAt (idx);
                if (freq [ch] -- <= 0) {
                  while (start <= idx)
                        if (freq [s.charAt(start ++)] ++ < 0) break;
                }
                if (idx - start + 1 == len) ans.add (start);
            }
            return ans;
        }


    public static void main(String[] args) {
        findAnagrams("abbab","ab").forEach(System.out::println);
//        System.out.println(findAnagrams("cacbde","abc"));
//        System.out.println(findAnagrams("abbab","ab"));
    }
}
