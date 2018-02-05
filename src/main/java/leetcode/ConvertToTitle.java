package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ConvertToTitle {

    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));
            n /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        //System.out.println(convertToTitle(15));
        List<Integer> list = Arrays.asList(1, 3, 4, 5 , 0, -1, 19);
        list.sort((a, b) -> b.compareTo(a));
        //list.stream().forEach(System.out::println);

        List<String> l = Arrays.asList("3", "30", "5");
        l.sort((a, b) -> (a+b).compareTo(b+ a));
        l.stream().forEach(System.out::println);

        // 3 30 5
        // 3, 30 => 330 vs 303 => 33
        // 3 30
        //-- 3, 30
        // 30, 5
        // 530 305
        // 5, 30
        // -- 3,5, 30
        // 3, 5
        // 35 53
        // 5 3 30
        // -- 5, 3, 30
    }
}
