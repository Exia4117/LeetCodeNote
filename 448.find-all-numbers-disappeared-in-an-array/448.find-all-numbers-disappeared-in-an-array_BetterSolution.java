import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 *
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 *
 * algorithms
 * Easy (54.54%)
 * Likes:    2116
 * Dislikes: 195
 * Total Accepted:    198.2K
 * Total Submissions: 362K
 * Testcase Example:  '[4,3,2,7,8,2,3,1]'
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * Could you do it without extra space and in O(n) runtime? You may assume the
 * returned list does not count as extra space.
 * 
 * Example:
 * 
 * Input:
 * [4,3,2,7,8,2,3,1]
 * 
 * Output:
 * [5,6]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> re = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return re;
        }
        for (int i = 0; i < nums.length; i++) {
            int value = Math.abs(nums[i]) - 1;
            if (nums[value] > 0) {
                nums[value] = -nums[value];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                re.add(i + 1);
            }
        }
        return re;
    }
}
// @lc code=end
