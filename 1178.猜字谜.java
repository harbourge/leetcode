import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=1178 lang=java
 *
 * [1178] 猜字谜
 *
 * https://leetcode-cn.com/problems/number-of-valid-words-for-each-puzzle/description/
 *
 * algorithms
 * Hard (30.46%)
 * Likes:    122
 * Dislikes: 0
 * Total Accepted:    7.5K
 * Total Submissions: 18.8K
 * Testcase Example:  '["aaaa","asas","able","ability","actt","actor","access"]\n' +
  '["aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"]'
 *
 * 外国友人仿照中国字谜设计了一个英文版猜字谜小游戏，请你来猜猜看吧。
 * 
 * 字谜的迷面 puzzle 按字符串形式给出，如果一个单词 word 符合下面两个条件，那么它就可以算作谜底：
 * 
 * 
 * 单词 word 中包含谜面 puzzle 的第一个字母。
 * 单词 word 中的每一个字母都可以在谜面 puzzle 中找到。
 * 例如，如果字谜的谜面是 "abcdefg"，那么可以作为谜底的单词有 "faced", "cabbage", 和 "baggage"；而
 * "beefed"（不含字母 "a"）以及 "based"（其中的 "s" 没有出现在谜面中）。
 * 
 * 
 * 返回一个答案数组 answer，数组中的每个元素 answer[i] 是在给出的单词列表 words 中可以作为字谜迷面 puzzles[i]
 * 所对应的谜底的单词数目。
 * 
 * 
 * 
 * 示例：
 * 
 * 输入：
 * words = ["aaaa","asas","able","ability","actt","actor","access"], 
 * puzzles = ["aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"]
 * 输出：[1,1,3,2,4,0]
 * 解释：
 * 1 个单词可以作为 "aboveyz" 的谜底 : "aaaa" 
 * 1 个单词可以作为 "abrodyz" 的谜底 : "aaaa"
 * 3 个单词可以作为 "abslute" 的谜底 : "aaaa", "asas", "able"
 * 2 个单词可以作为 "absoryz" 的谜底 : "aaaa", "asas"
 * 4 个单词可以作为 "actresz" 的谜底 : "aaaa", "asas", "actt", "access"
 * 没有单词可以作为 "gaswxyz" 的谜底，因为列表中的单词都不含字母 'g'。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= words.length <= 10^5
 * 4 <= words[i].length <= 50
 * 1 <= puzzles.length <= 10^4
 * puzzles[i].length == 7
 * words[i][j], puzzles[i][j] 都是小写英文字母。
 * 每个 puzzles[i] 所包含的字符都不重复。
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < puzzles.length; i++) {
            int count = 0;
            char[] puzzleArray = puzzles[i].toCharArray();
            for (int j = 0; j < words.length; j++) {
                char[] wordArray = words[j].toCharArray();
                // word中不包含puzzle首字母
                if (!arrayContain(wordArray, puzzleArray[0])) continue;

                // word中每一个字母都可以在puzzle中找到
                for (int k = 0; k < wordArray.length; k++) {
                    if (arrayContain(puzzleArray, wordArray[k])){
                        if(k == wordArray.length-1) count++;
                    }
                    else break;
                }
            }
            result.add(count);
        }
        return result;
    }

    public boolean arrayContain(char[] array, char ch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                return true;
            }
        }
        return false;
    }

    // public static void main(String[] args){
    //     Solution solution = new Solution();
    //     solution.findNumOfValidWords(new String[]{"aaaa","asas","able","ability","actt","actor","access"},
    //                                 new String[]{"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"})
    // }

}
// @lc code=end
