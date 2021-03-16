/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 *
 * https://leetcode-cn.com/problems/plus-one/description/
 *
 * algorithms
 * Easy (45.58%)
 * Likes:    630
 * Dislikes: 0
 * Total Accepted:    252.3K
 * Total Submissions: 553.5K
 * Testcase Example:  '[1,2,3]'
 *
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：digits = [0]
 * 输出：[1]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * 0 
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(++digits[i]<10) break;
            else digits[i] = digits[i]-10;
        }
        if(digits[0]==0){
            int[] array = new int[digits.length+1];
            array[0] = 1;
            for(int i=0;i<digits.length;i++){
                array[i+1] = digits[i];
            }
            return array;
        }
        
        return digits;

        // long num = 0;
        // for(int i=0;i<digits.length;i++){
        //     num = num*10+digits[i];
        // }
        // num++;
        // int len = String.valueOf(num).length();
        // int[] array = new int[len];
        // for(int i=len-1;i>=0;i--){
        //     array[i] = (int)(num%10);
        //     num=num/10;
        // }
        // return array;

    }
}
// @lc code=end

