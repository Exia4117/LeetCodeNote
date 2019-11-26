import java.util.HashMap;
import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (36.51%)
 * Likes:    2938
 * Dislikes: 145
 * Total Accepted:    601.7K
 * Total Submissions: 1.6M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */
class Solution {

    public static final HashMap<Character, Character> parentheses = new HashMap<Character, Character>() {
        {
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }
    };

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // for (int i = 0; i < s.length(); i++) {
        // char c = s.charAt(i);
        // if (parentheses.containsKey(c)) {
        // char top = stack.empty() ? ' ' : stack.pop();
        // if (top != parentheses.get(c)) {
        // return false;
        // }
        // } else {
        // stack.push(c);
        // }
        // }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (parentheses.containsValue(c)) {
                stack.push(c);
            } else {
                if (!stack.empty() && parentheses.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();

    }
}
