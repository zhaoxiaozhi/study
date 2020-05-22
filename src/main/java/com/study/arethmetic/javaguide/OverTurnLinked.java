package com.study.arethmetic.javaguide;

import com.study.arethmetic.javaguide.util.ListNode;

/**
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class OverTurnLinked {

    public static ListNode ReverseList(ListNode head){

        ListNode next = null;
        ListNode pre = null;
        while (head != null){
            //保存要翻转到头的节点
            next = head.next;
            // 要反转的那个节点指向已经反转的上一个节点(备注:第一次反转的时候会指向null)
            head.next = pre;
            // 上一个已经反转到头部的节点
            pre = head;
            // 一直向链表尾走
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        ReverseList(a);
        while (e != null) {
            System.out.println(e.val);
            e = e.next;
        }
    }



}
