/*
 * @lc app=leetcode id=9 lang=golang
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

func isPalindrome(x int) bool {
	if x < 0 {
		return false
	}
	digit := 1
	for temp := x;temp >= 10;temp /= 10{
		digit *= 10
	}

	for x > 0 {
		/* 
		必须是 > 0而不是>9
		>9时，用例1000021不通过
		*/
		left := x / digit
		right := x % 10
		if left != right{
			return false 
		}
		x = (x % digit)/10
		digit /= 100
	}
	return true
}

