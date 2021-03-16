import java.util.Arrays;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=224 lang=java
 *
 * [224] 基本计算器
 *
 * https://leetcode-cn.com/problems/basic-calculator/description/
 *
 * algorithms
 * Hard (39.05%)
 * Likes:    386
 * Dislikes: 0
 * Total Accepted:    29.8K
 * Total Submissions: 75.3K
 * Testcase Example:  '"1 + 1"'
 *
 * 实现一个基本的计算器来计算一个简单的字符串表达式 s 的值。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：s = "1 + 1"
 * 输出：2
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：s = " 2-1 + 2 "
 * 输出：3
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：s = "(1+(4+5+2)-3)+(6+8)"
 * 输出：23
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * s 由数字、'+'、'-'、'('、')'、和 ' ' 组成
 * s 表示一个有效的表达式
 * 
 * 
 */

// @lc code=start
class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack();
        stack.push(0);
        for(int i=0;i<s.length();i++){
            //' '忽略
            if(s.charAt(i) == ' ') continue;
            //括号递归
            if(Arrays.asList('(').contains(s.charAt(i))){
                //找到下一半括号递归计算一次，入栈
                // stack.push(s.charAt(i));
            }
            //符号入栈
            // if(Arrays.asList('+','-').contains(s.charAt(i))){
                
            // }
            if(Arrays.asList('+','-').contains(stack.peek())){
                 //数字入栈
                boolean isPlus = s.charAt(i)=='+';
                int a=stack.pop();
                int b=s.charAt(++i);
                int tmp = 0;
                if(isPlus) tmp = a+b;
                else tmp = a-b;
                stack.push(tmp);
            }
            stack.push(s.charAt(i)-'0');
        }
        return stack.pop();
    }

}
// @lc code=end
