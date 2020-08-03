package com.study.offer.listnode;

import com.study.offer.ListNode;

public class RemoveDuplicationNode {

    public ListNode deleteDuplication(ListNode node){
        if (node == null || node.next == null){
            return node;
        }
        ListNode head = new ListNode(-1);
        head.next = node;

        ListNode last = head, cur = head;
        while (cur != null && cur.next != null){
            if (cur.val != cur.next.val){
                last = cur;
                cur = cur.next;
            }else {
                int val = cur.val;
                while (cur != null && cur.val == val){
                    cur = cur.next;
                }
                last.next = cur;
            }
        }
        return head.next;

    }

}
