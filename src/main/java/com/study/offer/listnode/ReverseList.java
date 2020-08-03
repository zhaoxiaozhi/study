package com.study.offer.listnode;

import com.study.offer.ListNode;

public class ReverseList {

    //三指针法
    public ListNode reverseList1(ListNode head){
        if (head == null){
            return null;
        }
        ListNode first = null;
        ListNode second = head;
        ListNode third = head.next;
        while (third != null){
            second.next =  first;
            first = second;
            second = third;
            third = third.next;
        }
        second.next = first;
        return second;
    }

    /**
     * 递归法
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head){

        if (head == null || head.next == null){
            return head;
        }
       ListNode temp =  reverseList2(head.next);
        head.next.next  = head;
        head.next = null;
        return temp;
    }


}
