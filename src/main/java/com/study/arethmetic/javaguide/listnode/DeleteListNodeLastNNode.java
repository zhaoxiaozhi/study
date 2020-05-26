package com.study.arethmetic.javaguide.listnode;

import com.study.arethmetic.javaguide.util.ListNode;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */
public class DeleteListNodeLastNNode {


    /**
     * 两次遍历
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd1(ListNode head, int n){
        //哑结点，哑结点用来简化某些极端情况，例如列表中只含有一个结点，或需要删除列表的头部
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int length = 0;
        ListNode len = head;
        while (len != null){
            length ++;
            len = len.next;
        }
        length = length - n;
        //移除length+1 节点
        ListNode target = dummy;
        //找到l-n位置的节点
        while (length > 0){
            target = target.next;
            length --;
        }
        // 把第 (L - n)个结点的 next 指针重新链接至第 (L - n + 2)个结点
        target.next = target.next.next;
        return dummy.next;
    }

    /**
     * 定义两个节点 node1、node2;node1 节点先跑，node1节点 跑到第 n+1 个节点的时候,node2 节点开始跑.当node1 节点跑到最后一个节点时，node2 节点所在的位置就是第 （L-n ） 个节点（L代表总链表长度，也就是倒数第 n+1 个节点）
     * 一次遍历
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd2(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode node1 = dummy, node2 = dummy;
        while (node1 != null){
            node1 = node1.next;
            if (n < 1 && node1 != null){
                node2 = node2.next;
            }
            n--;
        }
        node2.next = node2.next.next;
        return dummy.next;
    }
}
