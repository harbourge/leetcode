/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        for(int i = 0;i<len-1; i++){
            if(nums[i] == nums[i+1]){
                for(int j = i+1;j<len-1;j++){
                    nums[j] = nums[j+1];
                }
                i--;
                len--;
            }
        }

        return len;
    }

 
}
// @lc code=end
