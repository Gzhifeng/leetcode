package com.zhifeng.linked.list;

/**
 * 反转链表
 * @author ganzhifeng
 * @date 2021/12/10
 */
public class Solution206 {

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

}
