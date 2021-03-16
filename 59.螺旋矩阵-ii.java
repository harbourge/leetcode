import javax.lang.model.type.TypeVisitor;

/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 *
 * https://leetcode-cn.com/problems/spiral-matrix-ii/description/
 *
 * algorithms
 * Medium (78.51%)
 * Likes:    354
 * Dislikes: 0
 * Total Accepted:    79.6K
 * Total Submissions: 99.6K
 * Testcase Example:  '3'
 *
 * 给你一个正整数 n ，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：n = 3
 * 输出：[[1,2,3],[8,9,4],[7,6,5]]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：n = 1
 * 输出：[[1]]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int len = n*n;
        int row=0,column=0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directIndex = 0;
        for(int i=1;i<=len;i++){
            res[row][column] = i;
            int nextRow = row+directions[directIndex][0];
            int nextColumn = column+directions[directIndex][1];
            if(nextRow<0||nextRow>=n||nextColumn<0||nextColumn>=n||res[nextRow][nextColumn]>0){
                directIndex = (directIndex+1)%4;
            }
            row+=directions[directIndex][0];
            column+=directions[directIndex][1];
        }
        
        return res;
    }
}
// @lc code=end

