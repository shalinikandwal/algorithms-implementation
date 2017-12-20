package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {

    public static boolean wordPattern(String pattern, String str) {
        String [] parts = str.split (" ");
        if (pattern.length() != parts.length) return false;

        Map map = new HashMap();
        for (int idx = 0; idx < pattern.length(); idx ++)
            if (!Objects.equals (map.put(pattern.charAt(idx), idx), map.put(parts [idx], idx)))
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println( wordPattern("abba", "sha bob bob sha"));
    }
}
