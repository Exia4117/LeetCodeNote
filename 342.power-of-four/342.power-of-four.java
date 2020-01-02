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
    // 一.4的幂首先是2的幂，因为4^n = （2^2）^n，
    // 故可以先判断是否为2的幂，同样利用n & (n - 1);

    // 二.不同是，4的幂的二进制表示中，1全奇数位上。
    // 所以进一步判断其与0x55555555按位与的结果，0x55555555是十六进制表示，
    // 换成二进制表示，可以发现，其奇数位上全是1，那么相与结果为true，则是4的幂，否则不是。

    public boolean isPowerOfFour(int num) {
        return ((num > 0) && ((num & (num - 1)) == 0) && ((num & 0x55555555) != 0));
    }
}
// @lc code=end
