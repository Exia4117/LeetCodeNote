import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=498 lang=java
 *
 * [498] Diagonal Traverse
 *
 * https://leetcode.com/problems/diagonal-traverse/description/
 *
 * algorithms
 * Medium (46.28%)
 * Likes:    470
 * Dislikes: 268
 * Total Accepted:    57.1K
 * Total Submissions: 123.1K
 * Testcase Example:  '[[1,2,3],[4,5,6],[7,8,9]]'
 *
 * Given a matrix of M x N elements (M rows, N columns), return all elements of
 * the matrix in diagonal order as shown in the below image.
 * 
 * 
 * 
 * Example:
 * 
 * 
 * Input:
 * [
 * ⁠[ 1, 2, 3 ],
 * ⁠[ 4, 5, 6 ],
 * ⁠[ 7, 8, 9 ]
 * ]
 * 
 * Output:  [1,2,4,7,5,3,6,8,9]
 * 
 * Explanation:
 * 
 * 
 * 
 * 
 * 
 * Note:
 * 
 * The total number of elements of the given matrix will not exceed 10,000.
 * 
 */

// @lc code=start
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }

        int[] re = new int[matrix.length * matrix[0].length];
        ArrayList<Integer> reArray = new ArrayList<>();

        int aR = 0;
        int aC = 0;
        int bR = 0;
        int bC = 0;
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;
        boolean flag = true;
        while (aR <= endR) {
            reArray.addAll(DiagonalOrder(matrix, aR, aC, bR, bC, flag));
            aR = aC == endC ? aR + 1 : aR;
            aC = aC == endC ? aC : aC + 1;
            bC = bR == endR ? bC + 1 : bC;/* 注意顺序！！！！！ */
            bR = bR == endR ? bR : bR + 1;
            flag = !flag;
        }
        for (int i = 0; i < reArray.size(); i++) {
            re[i] = reArray.get(i);
        }
        return re;
    }

    public ArrayList<Integer> DiagonalOrder(int[][] matrix, int aR, int aC, int bR, int bC, boolean flag) {
        ArrayList<Integer> re = new ArrayList<>();
        if (flag) {
            while (bR != aR - 1) {
                re.add(matrix[bR--][bC++]);
            }
        } else {
            while (aR != bR + 1) {
                re.add(matrix[aR++][aC--]);
            }
        }
        return re;
    }

}
// @lc code=end
