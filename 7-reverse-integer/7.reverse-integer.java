/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.30%)
 * Likes:    2159
 * Dislikes: 3284
 * Total Accepted:    693.3K
 * Total Submissions: 2.7M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 * 
 */
class Solution {
    public int reverse(int x) {
        long num = 0;
        int temp = 0;
        while (x != 0) {
            temp =  x % 10;
            num = num * 10 + temp;
            x /= 10;
        }
        if ( num >= -2147483648 && num <= 2147483647 ) {
            return (int) num;
        } else {
            return 0;
        }
    }
}
