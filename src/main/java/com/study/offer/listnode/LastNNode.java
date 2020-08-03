package com.study.offer.listnode;

import com.study.offer.ListNode;

/**
 * 打印链表倒数第N个节点
 */
public class LastNNode {

    //双指针法
    public ListNode FindLastNNode(ListNode head, int k){
        if (head == null){
            return null;
        }
        ListNode fast = head, slow = head;
        //快指针先到K点
        for (int i = 0; i < k; i++){
            if (fast != null){
                fast = fast.next;
            }else {
                return null;
            }
        }
        //两个指针同时移动
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }


}
