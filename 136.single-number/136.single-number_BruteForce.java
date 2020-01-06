import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 *
 * https://leetcode.com/problems/single-number/description/
 *
 * algorithms
 * Easy (62.04%)
 * Likes:    3245
 * Dislikes: 126
 * Total Accepted:    592.9K
 * Total Submissions: 950.1K
 * Testcase Example:  '[2,2,1]'
 *
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Note:
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * Example 1:
 * 
 * 
 * Input: [2,2,1]
 * Output: 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [4,1,2,1,2]
 * Output: 4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> help = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!help.add(nums[i])) {
                help.remove(nums[i]);
            }
        }
        return help.iterator().next();
    }
}
// @lc code=end
