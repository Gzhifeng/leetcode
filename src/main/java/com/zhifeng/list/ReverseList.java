package com.zhifeng.list;

/**
 * 反转链表 --> 力扣206
 * @author ganzhifeng
 * @date 2021/3/8
 */
public class ReverseList {

    /**
     * 生成ListNode
     * @return
     */
    public static ListNode createList(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        return listNode1;
    }

    /**
     * 测试单链表数据结构的使用
     */
    public static void readListNode(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    /**
     * 反转单链表
     * 测试输入 [1,2,3,4,5]
     * 返回 [5,4,3,2,1]
     * 思路：替换链表的下一个节点
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode listNode = createList();
        ListNode reverseList = reverseList(listNode);
        readListNode(reverseList);
    }

}
