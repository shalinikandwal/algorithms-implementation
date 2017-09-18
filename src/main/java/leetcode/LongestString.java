package leetcode;

/**The Class
 *
 */
public class LongestString {
    /**
     * Find the Longest uncommon string
     * @param a
     * @param b
     * @return int
     */
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        int lena = a.length();
        int lenb = b.length();
        return  lena > lenb ? lena :lenb;
    }
}
