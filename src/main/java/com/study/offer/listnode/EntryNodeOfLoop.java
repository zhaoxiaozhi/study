package com.study.offer.listnode;

import com.study.offer.ListNode;

/**
 * 找出链表中环的入口
 */
public class EntryNodeOfLoop {

    public ListNode getEntryNodeOfLoop(ListNode node){

        if (node == null || node.next == null){
            return null;
        }
        ListNode meet = meetingNode(node);
        if (meet == null){
            return null;
        }
        //求环的长度
        ListNode temp = meet;
        int len = 1;
        temp = temp.next;
        while (temp != meet){
            temp = temp.next;
            len++;
        }
        ListNode fast = node, slow = node;
        //快指针比慢指针多走len步
        for (int i = 0; i <len; i++){
            fast = fast.next;
        }
        //得到环的入口
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    /**
     * 判断是是否有 环，有环必定相遇
     * @param node
     * @return
     */
    private ListNode meetingNode(ListNode node){
        if (node == null || node.next == null){
            return null;
        }
        ListNode fast = node, slow = node;

        while (fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return slow;
            }
        }
        return slow;
    }
}







