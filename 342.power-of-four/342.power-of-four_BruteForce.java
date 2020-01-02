/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 *
 * https://leetcode.com/problems/power-of-four/description/
 *
 * algorithms
 * Easy (40.89%)
 * Likes:    377
 * Dislikes: 172
 * Total Accepted:    131.1K
 * Total Submissions: 319.8K
 * Testcase Example:  '16'
 *
 * Given an integer (signed 32 bits), write a function to check whether it is a
 * power of 4.
 * 
 * Example 1:
 * 
 * 
 * Input: 16
 * Output: true
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 5
 * Output: false
 * 
 * 
 * Follow up: Could you solve it without loops/recursion?
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0)
            return false;
        if (num == 1)
            return true;
        if (num % 10 != 4 && num % 10 != 6)
            return false;
        while (num > 1) {
            if (num % 4 != 0)
                return false;
            num /= 4;
        }
        return true;
    }
}
// @lc code=end
