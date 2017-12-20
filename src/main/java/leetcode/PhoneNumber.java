package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PhoneNumber {

    public static List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0)
            return new ArrayList<>();


        String[] strs = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        LinkedList<String> queue = new LinkedList<>();
        queue.add("");

        for(char c : digits.toCharArray()){
            int count = queue.size();
            while(count-- > 0){
                String element = queue.poll();
                for(char c1 : strs[c - '0'].toCharArray()) {
                    queue.add(element + c1);
                }
            }
        }
        return queue;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("34"));
    }
}
