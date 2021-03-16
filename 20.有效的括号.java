/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (char tmp : s.toCharArray()) {
            if (tmp == '(' || tmp == '[' || tmp == '{') {
                stack.push(tmp);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (tmp == ')' && stack.pop() != '(') {
                    return false;
                }

                if (tmp == ']' && stack.pop() != '[') {
                    return false;
                }
                if (tmp == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
// @lc code=end
