package com.study.arethmetic.javaguide.listnode;

import com.study.arethmetic.javaguide.util.ListNode;

public class LastKNode {

    public ListNode FindKthToTail(ListNode head, int k){

        if (head == null || k <= 0){
            return null;
        }
        ListNode node1 = head, node2 = head;
        int count = 0;

        int index= k;
        while (node1 != null){
            node1 = node1.next;
            count++;
            if (k < 1) {
                node2 = node2.next;
            }
            k--;
        }
        if (count < index){
            return null;
        }
        return node2;
    }

}
