/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[] { 0, 1 };
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    index[0] = i;
                    index[1] = j;
                    break;
                } 
            }
        }

        return index;
    }
}
/*
暴力破解
*/
