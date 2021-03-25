/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String str0 = strs[0];
        String strResult = "";
        String tmp = "";

        for(int i = 0;i<str0.length(); i++){
            tmp = str0.substring(0,i);
            for(String str : strs){
                if(!isaz(str)){
                    return "";
                }
                str0.
            }
        }
    }

    private boolean isaz(String str) {
        for (char c : str.toCharArray()) {
            if (c < 'a' || c > 'z') {
                return false;
            }
        }
    }
}
// @lc code=end
