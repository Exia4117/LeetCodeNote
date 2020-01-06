import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
        if (nums.length == 0) {
            return re;
        }
        Set<Integer> help = new HashSet<>();
        // help.add(nums[0]);
        for (int i = 0; i < nums.length; i++) {
            // if (help.contains(nums[i]))
            // continue;
            help.add(nums[i]);
        }
        for (int j = 1; j <= nums.length; j++) {
            if (!help.contains(j)) {
                re.add(j);
            }
        }
        return re;
    }
}
// @lc code=end
