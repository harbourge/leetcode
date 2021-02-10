/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String str0 = strs[0];
        String strResult = "";
        String tmp = "";

        // 从第一个字符开始截取
        for (int i = 1; i <= str0.length(); i++) {
            tmp = str0.substring(0, i);

            for (String str : strs) {
                // 判断是否是小写字母
                if (!isaz(str)) {
                    return "";
                }
                // 如果不一致，返回当前结果
                if (!str.startsWith(tmp)) {
                    return strResult;
                }
            }
            // 如果一致，缓存当前结果
            strResult = tmp;
        }
        return strResult;
    }

    private static boolean isaz(String str) {
        for (char c : str.toCharArray()) {
            if (c < 'a' || c > 'z') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] { "flower", "flower", "flower" }));
    }

}

// @lc code=end
