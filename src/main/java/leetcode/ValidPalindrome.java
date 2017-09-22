package leetcode;

/**125 valid palindrome
 *Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.


 */
public class ValidPalindrome {
    /**
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0, r = s.length()-1;
        while(l < r)
            if((s.charAt(l) > 'z' || s.charAt(l) < 'a') && (s.charAt(l) > '9' || s.charAt(l) < '0')) l++;
            else if((s.charAt(r) > 'z' || s.charAt(r) < 'a') && (s.charAt(r) > '9' || s.charAt(r) < '0')) r--;
            else if(s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }

}

