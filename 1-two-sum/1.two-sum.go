/*
 * @lc app=leetcode id=1 lang=golang
 *
 * [1] Two Sum
 *
 * https://leetcode.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (44.17%)
 * Likes:    10781
 * Dislikes: 361
 * Total Accepted:    1.8M
 * Total Submissions: 4.1M
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 *
 * Example:
 *
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 *
 *
 *
 */
func twoSum(nums []int, target int) []int {
	m := make(map[int]int)
	for i, v := range nums {
		m[target-v] = i
	}
	for j, v := range nums {
		if index, ok := m[v]; ok && m[v] != j {
			return []int{j, index}
		}
	}
	return []int{}
}

