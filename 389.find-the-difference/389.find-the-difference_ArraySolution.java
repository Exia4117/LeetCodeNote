import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 *
 * https://leetcode.com/problems/find-the-difference/description/
 *
 * algorithms
 * Easy (53.92%)
 * Likes:    612
 * Dislikes: 255
 * Total Accepted:    169.5K
 * Total Submissions: 313.2K
 * Testcase Example:  '"abcd"\n"abcde"'
 *
 * 
 * Given two strings s and t which consist of only lowercase letters.
 * 
 * String t is generated by random shuffling string s and then add one more
 * letter at a random position.
 * 
 * Find the letter that was added in t.
 * 
 * Example:
 * 
 * Input:
 * s = "abcd"
 * t = "abcde"
 * 
 * Output:
 * e
 * 
 * Explanation:
 * 'e' is the letter that was added.
 * 
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        int[] alph = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alph[(int) (s.charAt(i) - 'a')]++;
            alph[(int) (t.charAt(i) - 'a')]--;
        }
        alph[(int) (t.charAt(t.length() - 1) - 'a')]--;
        int i = 0;
        for (; i < 26; i++) {
            if (alph[i] == -1)
                break;
        }
        return (char) ('a' + i);
    }
}
// @lc code=end
