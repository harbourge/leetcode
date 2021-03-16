import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 *
 * https://leetcode-cn.com/problems/spiral-matrix/description/
 *
 * algorithms
 * Medium (42.77%)
 * Likes:    693
 * Dislikes: 0
 * Total Accepted:    125.8K
 * Total Submissions: 278.1K
 * Testcase Example:  '[[1,2,3],[4,5,6],[7,8,9]]'
 *
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * 输出：[1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * m == matrix.length
 * n == matrix[i].length
 * 1 
 * -100 
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> res=  new ArrayList<>();
        if(matrix == null ||m==0 || n==0) return res;
        boolean[][] visited = new boolean[m][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int directIndex = 0;
        int total = m*n;
        int row = 0, column = 0;
        for(int x=0;x<total;x++){
            res.add(matrix[row][column]);
            visited[row][column] = true;
            int nextRow = row+directions[directIndex][0];
            int nextColumn = column+directions[directIndex][1];
            if(nextRow>=m || nextRow<0 || nextColumn>=n || nextColumn<0 || visited[nextRow][nextColumn]){
                directIndex = (directIndex+1)%4;
            }
            row+=directions[directIndex][0];
            column+=directions[directIndex][1];
        }
        return res;
    }
}
// @lc code=end

