import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Deque;

/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 *
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * algorithms
 * Easy (43.33%)
 * Likes:    1417
 * Dislikes: 1295
 * Total Accepted:    582.5K
 * Total Submissions: 1.3M
 * Testcase Example:  '121'
 *
 * Determine whether an integer is a palindrome. An integer is a palindrome
 * when it reads the same backward as forward.
 * 
 * Example 1:
 * 
 * 
 * Input: 121
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it
 * becomes 121-. Therefore it is not a palindrome.
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a
 * palindrome.
 * 
 * 
 * Follow up:
 * 
 * Coud you solve it without converting the integer to a string?
 * 
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        Deque<Integer> solution = new ArrayDeque<Integer>();
        // ArrayList<Integer> input = new ArrayList<Integer>();
        int temp = 0;
        while (x != 0) {
            temp = x % 10;
            solution.addFirst(temp);
            x /= 10;
        }
        while (solution.size() > 1) {
            if (solution.getFirst() == solution.getLast()) {
                solution.removeFirst();
                solution.removeLast();
            } else {
                return false;
            }
        }
        return true;
    }
}
/* 
Deque Solution
 */
