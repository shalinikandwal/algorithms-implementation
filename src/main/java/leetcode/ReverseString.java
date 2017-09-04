package leetcode;

/**
 * 344. Reverse String
 *
 * Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".
 */
public class ReverseString {

    public String reverseString(String s) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            str.insert(0,s.charAt(i));

        }
        return str.toString().trim();

    }
}
