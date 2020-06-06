package com.study.arethmetic.javaguide.listnode;

import com.study.arethmetic.javaguide.util.ListNode;

/**
 *输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeListNode {

    public static ListNode mergeDigui(ListNode list1, ListNode list2){

        //list1为空，直接返回list2
        if (list1 == null){
            return list2;
        }
        //list2为空，直接返回list1
        if (list2 == null){
            return list1;
        }
        if (list1.val <= list2.val){
            list1.next = mergeDigui(list1.next, list2);
            return list1;
        }else {
            list2.next = mergeDigui(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(8);
        list1.next = node1;
        node1.next = node2;
        node2.next = node3;

        ListNode list2 = new ListNode(2);
        ListNode lnode1 = new ListNode(4);
        ListNode lnode2 = new ListNode(6);
        ListNode lnode3 = new ListNode(7);
        list1.next = lnode1;
        lnode1.next = lnode2;
        lnode2.next = lnode3;

        mergeDigui(list1, list2);
    }
}
