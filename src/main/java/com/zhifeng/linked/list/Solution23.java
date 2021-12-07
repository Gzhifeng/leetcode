package com.zhifeng.linked.list;

/**
 * 合并K个升序链表
 * @author ganzhifeng
 * @date 2021/12/1
 */
public class Solution23 {

    public ListNode mergeKList(ListNode[] lists) {
        ListNode ans = null;
        for (int i = 0; i < lists.length; i++) {
           ans = mergeTwoList(ans, lists[i]);
        }
        return ans;
    }

    private ListNode mergeTwoList(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return a != null ? a : b;
        }

        ListNode head = new ListNode(0);
        ListNode tail = head, aPtr = a, bPtr = b;
        while (aPtr != null && bPtr != null) {
            if (aPtr.val < bPtr.val) {
                tail.next = aPtr;
                aPtr = aPtr.next;
            } else {
                tail.next = bPtr;
                bPtr = bPtr.next;
            }
            tail = tail.next;
        }
        tail.next = aPtr != null ? aPtr : bPtr;
        return head.next;
    }

}
