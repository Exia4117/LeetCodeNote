/*
 * @lc app=leetcode id=14 lang=golang
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (33.51%)
 * Likes:    1368
 * Dislikes: 1317
 * Total Accepted:    470.3K
 * Total Submissions: 1.4M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * 
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Note:
 * 
 * All given inputs are in lowercase letters a-z.
 * 
 */
func longestCommonPrefix(strs []string) string {
    if strs == nil || len(strs) == 0{
		return ""
	}
	min := len(strs[0])
	for _,v := range strs{
		if len(v) < min{
			min = len(v)
		}
	}
	common := make([]rune,min)
	for j := 0;j<min;j++{
		k := 1
		temp := strs[0][j]
		for k < len(strs){
			if strs[k][j] != strs[0][j]{
				break
			}
			k++
		}
		if k == len(strs){
			common[j] = rune(temp)
		}else{
			break
		}
	}
	str := make([]rune,0, min)
	for _, v := range common {
		if !unicode.IsLetter(v) && !unicode.IsDigit(v) {
		  continue
		}
	
		str = append(str, v)
	  }
	return string(str)
}

