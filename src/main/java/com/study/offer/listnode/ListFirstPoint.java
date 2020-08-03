package com.study.offer.listnode;

import com.study.offer.ListNode;

/**
 * 找出第一个公共交点
 */
public class ListFirstPoint {
    /**
     * 双指针法
     * @param node1
     * @param node2
     * @return
     */
    public ListNode getFirstPoint(ListNode node1, ListNode node2){

        if (node1 == null || node2 == null){
            return null;
        }
        ListNode head1 = node1, head2 = node2;

        while (head1 != head2){
            head1 = head1 == null ? head2 : head1.next;
            head2 = head2 == null ? head1 : head2.next;
        }
        return head1;
    }
}
