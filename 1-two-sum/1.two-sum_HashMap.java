import java.util.HashMap;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[] { 0, 1 };
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            m.put(target - nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            if (m.containsKey(nums[j]) && m.get(nums[j]) != j) {
                index[1] = m.get(nums[j]);
                index[0] = j;
                break;
            }
        }
        return index;
    }
}
/*
 * hashmap
 */
