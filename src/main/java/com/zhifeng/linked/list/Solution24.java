package com.zhifeng.linked.list;

/**
 * 两两交换链表中的节点
 *
 *  * 作者：LeetCode-Solution
 *  * 链接：https://leetcode-cn.com/problems/longest-harmonious-subsequence/solution/zui-chang-he-xie-zi-xu-lie-by-leetcode-s-8cyr/
 *  * 来源：力扣（LeetCode）
 *  * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * @author ganzhifeng
 * @date 2021/12/7
 */
public class Solution24 {

    public static ListNode swapPairas(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        head.next = swapPairas(newHead.next);
        newHead.next = head;
        return newHead;
    }

    public ListNode swap1(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        head.next = swap1(newHead.next);
        newHead.next = head;
        return newHead;
    }

    public ListNode swap2(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;
        head.next = swap2(newHead.next);
        newHead = head;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(3);

        listNode.next = listNode1;
        listNode1.next = listNode2;

        swapPairas(listNode);

    }

}
