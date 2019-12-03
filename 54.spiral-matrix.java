import java.util.List;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 *
 * https://leetcode.com/problems/spiral-matrix/description/
 *
 * algorithms
 * Medium (32.00%)
 * Likes:    1543
 * Dislikes: 468
 * Total Accepted:    290.9K
 * Total Submissions: 906.6K
 * Testcase Example:  '[[1,2,3],[4,5,6],[7,8,9]]'
 *
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * Example 1:
 * 
 * 
 * Input:
 * [
 * ⁠[ 1, 2, 3 ],
 * ⁠[ 4, 5, 6 ],
 * ⁠[ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * 
 * 
 * Example 2:
 * 
 * Input:
 * [
 * ⁠ [1, 2, 3, 4],
 * ⁠ [5, 6, 7, 8],
 * ⁠ [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> re = new ArrayList<Integer>();
        int startC = 0;
        int startR = 0;
        if (matrix.length == 0) {
            return re;
        }
        int endR = matrix.length - 1;
        int endC = matrix[0].length - 1;

        while (startR <= endR && startC <= endC) {
            re.addAll(round(matrix, startR++, startC++, endR--, endC--));
        }
        return re;
    }

    public List<Integer> round(int[][] matrix, int startR, int startC, int endR, int endC) {
        List<Integer> re = new ArrayList<Integer>();
        if (startR == endR) {
            for (int i = startC; i <= endC; i++) {
                re.add(matrix[startR][i]);
            }
        } else if (startC == endC) {
            for (int i = startR; i <= endR; i++) {
                re.add(matrix[i][startC]);
            }
        } else {
            int curR = startR;
            int curC = startC;
            while (curC < endC) {
                re.add(matrix[startR][curC++]);
            }
            while (curR < endR) {
                re.add(matrix[curR++][endC]);
            }
            while (curC > startC) {
                re.add(matrix[endR][curC--]);
            }
            while (curR > startR) {
                re.add(matrix[curR--][startC]);
            }
        }
        return re;
    }
}
// @lc code=end
