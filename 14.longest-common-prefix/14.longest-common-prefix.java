import java.util.ArrayList;

/*
 * @lc app=leetcode id=14 lang=java
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
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        /*
         * 测试用例为空，后面会报数组越界，所以需要判断
         */
        String str = "";
        int min = strs[0].length();
        char[][] ch = new char[strs.length][];
        for (int i = 0; i < strs.length; i++) {
            ch[i] = strs[i].toCharArray();
            if (min > strs[i].length())
                min = strs[i].length();
        }
        char[] commen = new char[min];
        for (int j = 0; j < min; j++) {
            char temp = ch[0][j];
            int k = 1;
            while (k < strs.length) {
                temp = ch[k][j];
                if (temp != ch[k - 1][j])
                    break;
                k++;
            }
            if (k == strs.length) {
                commen[j] = temp;
            } else {
                break;
            }
        }
        for (int n = 0; n < commen.length && commen[n] != '\0'; n++) {
            str = str + commen[n];
        }
        /*
         * 注意数组越界问题
         */
        return str;
    }
}
