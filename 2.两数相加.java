import javax.management.ListenerNotFoundException;

/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 *
 * https://leetcode-cn.com/problems/add-two-numbers/description/
 *
 * algorithms
 * Medium (39.55%)
 * Likes:    5787
 * Dislikes: 0
 * Total Accepted:    743.5K
 * Total Submissions: 1.9M
 * Testcase Example:  '[2,4,3]\n[5,6,4]'
 *
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 
 * 题目数据保证列表表示的数字不含前导零
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode node = result;
        int tmp = 0;
        while(l1!= null && l2!=null){
            int sum = l1.val+l2.val + tmp;
            node.next = new ListNode(sum%10);
            tmp = sum/10;
            l1 = l1.next;
            l2 = l2.next;
            node = node.next;
        }

        while(l1!=null && l2==null){
            int sum = l1.val+tmp;
            node.next = new ListNode(sum%10);
            tmp = sum/10;
            l1 = l1.next;
            node = node.next;
        }    
        
        while(l1==null && l2!=null){
            int sum = l2.val+tmp;
            node.next = new ListNode(sum%10);
            tmp = sum/10;
            l2 = l2.next;
            node = node.next;
        }
        if(tmp>0){
            node.next = new ListNode(tmp);
        }
        return result.next;

    }
}
// @lc code=end

