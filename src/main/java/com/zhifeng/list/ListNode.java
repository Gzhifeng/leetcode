package com.zhifeng.list;

import lombok.Data;

/**
 * 链表
 * @author ganzhifeng
 * @date 2021/3/1
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(){

    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
