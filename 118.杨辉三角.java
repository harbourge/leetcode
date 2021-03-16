import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 *
 * https://leetcode-cn.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (69.94%)
 * Likes:    459
 * Dislikes: 0
 * Total Accepted:    154.2K
 * Total Submissions: 220K
 * Testcase Example:  '5'
 *
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 
 * 
 * 
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 
 * 示例:
 * 
 * 输入: 5
 * 输出:
 * [
 * ⁠    [1],
 * ⁠   [1,1],
 * ⁠  [1,2,1],
 * ⁠ [1,3,3,1],
 * ⁠[1,4,6,4,1]
 * ]
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return null;

        List<Integer> list1 = Arrays.asList(1);
        List<List<Integer>> res = new ArrayList<>(Arrays.asList(list1));
        if(numRows == 1) return res;

        for(int i=2;i<=numRows;i++){
            List<Integer> tmp = res.get(i-2);
            List<Integer> list = new ArrayList<>(i);
            list.add(0, 1);
            for(int j=1;j<i-1;j++){
                list.add(j, tmp.get(j-1)+tmp.get(j));
            }
            list.add(1);
            res.add(list);
        }
        return res;
    }


}
// @lc code=end

