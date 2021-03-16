import java.io.StringBufferInputStream;

/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 *
 * https://leetcode-cn.com/problems/zigzag-conversion/description/
 *
 * algorithms
 * Medium (49.58%)
 * Likes:    1055
 * Dislikes: 0
 * Total Accepted:    225.7K
 * Total Submissions: 453.9K
 * Testcase Example:  '"PAYPALISHIRING"\n3'
 *
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * 
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 * 
 * 
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * 
 * 请你实现这个将字符串进行指定行数变换的函数：
 * 
 * 
 * string convert(string s, int numRows);
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 * 
 * 示例 2：
 * 
 * 
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * 解释：
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：s = "A", numRows = 1
 * 输出："A"
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * s 由英文字母（小写和大写）、',' 和 '.' 组成
 * 1 
 * 
 * 
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<=numRows || numRows==1) return s;

        int flag = 1,index = 0;
        StringBuffer[] buffer = new StringBuffer[numRows];
        for(int i=0;i<numRows;i++){
            buffer[i] = new StringBuffer();
        }
        for(int i=0;i<s.length();i++){
            buffer[index].append(s.charAt(i));
            if(index+flag>=numRows || index+flag < 0){
                flag = 0-flag;
            }
            index+=flag;
        }
        StringBuffer res= new StringBuffer();
        for(int i=0;i<numRows;i++){
            res.append(buffer[i].toString());
        }

        return res.toString();
    }
}
// @lc code=end

