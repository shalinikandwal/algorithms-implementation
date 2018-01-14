package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

    public static List<String> permutations(String s){
        List<String> results = new ArrayList<>();
        permutation ("", s, results);
        return results;
    }

    private static void permutation (String prefix, String suffix, List<String> results){
        if ( suffix.length() == 0) results.add(prefix);
        else {
            for ( int i = 0; i< suffix.length(); i++){
                permutation(prefix + suffix.charAt(i), suffix.substring(0,i) + suffix.substring(i+1, suffix.length()),results);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(permutations("abc"));
    }
}
