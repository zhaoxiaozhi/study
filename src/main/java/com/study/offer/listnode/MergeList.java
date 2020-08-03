package com.study.offer.listnode;

import com.study.offer.ListNode;

/**
 * 合并链表
 */
public class MergeList {

    public ListNode mergeListNode(ListNode node1, ListNode node2){
      if (node1 == null){
          return node2;
      }
      if (node2 == null){
          return node1;
      }
      ListNode head = null;
      //头结点
      if (node1.val <= node2.val){
        head = node1;
        head.next = mergeListNode(node1.next, node2);
      }else {
          head = node2;
          head.next = mergeListNode(node1, node2.next);
      }
      return head;
    }

    public ListNode mergListNode2(ListNode node1, ListNode node2){

        if (node1 == null){
            return node2;
        }
        if (node2 == null){
            return node1;
        }
        //头结点
        ListNode head = new ListNode(-1);
        ListNode theHead = head;
        while (node1 != null && node2 != null){
            if (node1.val <= node2.val){
                theHead.next = node1;
                node1 = node1.next;
            }else {
                theHead.next = node2;
                node2 = node2.next;
            }
            theHead = theHead.next;
        }
        if (node1 != null){
            theHead.next = node1;
        }
        if (node2 != null){
            theHead.next = node2;
        }
        return head.next;

    }

}
