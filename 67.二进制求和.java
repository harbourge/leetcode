/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 *
 * https://leetcode-cn.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (54.45%)
 * Likes:    562
 * Dislikes: 0
 * Total Accepted:    149.9K
 * Total Submissions: 275.3K
 * Testcase Example:  '"11"\n"1"'
 *
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 
 * 示例 2:
 * 
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 每个字符串仅由字符 '0' 或 '1' 组成。
 * 1 <= a.length, b.length <= 10^4
 * 字符串如果不是 "0" ，就都不含前导零。
 * 
 * 
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int tmp = 0;
        StringBuffer buffer = new StringBuffer();
        while(i>=0 && j>=0){
            int sum = a.charAt(i--)-'0' + b.charAt(j--)-'0' + tmp;
            buffer.append(sum%2);
            tmp = sum/2;
        }

        while(i>=0){
            int sum = tmp + a.charAt(i--)-'0';
            buffer.append(sum%2);
            tmp = sum/2;
        }

        while(j>=0){
            int sum = tmp + b.charAt(j--)-'0';
            buffer.append(sum%2);
            tmp = sum/2;
        }
        if(tmp == 1){
            buffer.append(tmp);
        }

        return buffer.reverse().toString();
    }
}
// @lc code=end

