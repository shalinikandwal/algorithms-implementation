package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();
        for ( int i = 0; i < s.length() ; i ++){
            if (s.charAt(i) == '{') stk.push ('}');
            else if(s.charAt(i) == '[') stk.push(']');
            else if(s.charAt(i) == '(') stk.push(')');
            else if ( stk.isEmpty() || s.charAt(i) != stk.pop()) return false;
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("[[[[]]]]"));
    }

}
