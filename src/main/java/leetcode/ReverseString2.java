package leetcode;

/**
 * 344. Reverse String
 */
public class ReverseString2 {
    /**
     * Reverse a string
     * @param s String
     * @return String
     */
    public String reverseString(String s) {

        if(s == null || s.length() == 0) return "";
        int begin =0;
        int end = s.length() - 1;
        char[] ch = s.toCharArray();
        while(begin <= end){
            char temp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = temp;
            begin ++;
            end --;
        }
        return new String(ch);
    }
}
