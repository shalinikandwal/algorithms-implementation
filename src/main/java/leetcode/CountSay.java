package leetcode;

public class CountSay {
    public static String countAndSay(int n) {
        String curr = "1";
        while (-- n > 0) {
            String next = "";
            Character prevCh = curr.charAt (0);
            for (int idx = 1, count = 1; idx <= curr.length(); idx ++) {
                if (idx == curr.length ()) { next += String.valueOf (count) + prevCh; break; }
                if (prevCh != curr.charAt (idx)) {
                    next += String.valueOf (count) + prevCh;
                    prevCh = curr.charAt (idx);
                    count = 1;
                } else count ++;
            }
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println( countAndSay(6));
    }
}
