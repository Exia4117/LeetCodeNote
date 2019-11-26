/*
 * @lc app=leetcode id=164 lang=java
 *
 * [164] Maximum Gap
 *
 * https://leetcode.com/problems/maximum-gap/description/
 *
 * algorithms
 * Hard (33.73%)
 * Likes:    621
 * Dislikes: 149
 * Total Accepted:    77.9K
 * Total Submissions: 230.8K
 * Testcase Example:  '[3,6,9,1]'
 *
 * Given an unsorted array, find the maximum difference between the successive
 * elements in its sorted form.
 * 
 * Return 0 if the array contains less than 2 elements.
 * 
 * Example 1:
 * 
 * 
 * Input: [3,6,9,1]
 * Output: 3
 * Explanation: The sorted form of the array is [1,3,6,9], either
 * (3,6) or (6,9) has the maximum difference 3.
 * 
 * Example 2:
 * 
 * 
 * Input: [10]
 * Output: 0
 * Explanation: The array contains less than 2 elements, therefore return 0.
 * 
 * Note:
 * 
 * 
 * You may assume all elements in the array are non-negative integers and fit
 * in the 32-bit signed integer range.
 * Try to solve it in linear time/space.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        if (max == min) {
            return 0;
        }
        int len = nums.length;
        int[] maxs = new int[len + 1];
        int[] mins = new int[len + 1];
        boolean[] hasNum = new boolean[len + 1];
        int bid = 0;
        for (int i = 0; i < len; i++) {
            bid = bucket(nums[i], max, min, len);
            maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], nums[i]) : nums[i];
            mins[bid] = hasNum[bid] ? Math.min(mins[bid], nums[i]) : nums[i];
            hasNum[bid] = true;
        }
        int res = 0;
        int lastMax = maxs[0];
        for (int i = 1; i < len + 1; i++) {
            if (hasNum[i]) {
                res = Math.max(mins[i] - lastMax, res);
                lastMax = maxs[i];
            }
        }
        return res;
    }

    public static int bucket(long num, long max, long min, long len) {
        return (int) ((num - min) * len / (max - min));
    }
}
// @lc code=end
