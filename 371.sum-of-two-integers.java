/*
 * @lc app=leetcode id=371 lang=java
 *
 * [371] Sum of Two Integers
 *
 * https://leetcode.com/problems/sum-of-two-integers/description/
 *
 * algorithms
 * Easy (50.78%)
 * Likes:    958
 * Dislikes: 1791
 * Total Accepted:    160.2K
 * Total Submissions: 315.8K
 * Testcase Example:  '1\n2'
 *
 * Calculate the sum of two integers a and b, but you are not allowed to use
 * the operator + and -.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: a = 1, b = 2
 * Output: 3
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: a = -2, b = 3
 * Output: 1
 * 
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    public int getSum(int a, int b) {
        int re = a ^ b;
        int carry = (a & b) << 1;
        if (carry != 0)
            return getSum(re, carry);
        return re;
    }
}
// @lc code=end
