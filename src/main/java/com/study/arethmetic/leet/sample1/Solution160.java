package com.study.arethmetic.leet.sample1;

import com.study.arethmetic.leet.util.ListNode;

import java.util.HashSet;

/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 */
public class Solution160 {


    /**
     * 对链表A中的每一个结点
     *  ，遍历整个链表 B 并检查链表 B 中是否存在结点和 A节点
     *   相同。
     * @param headA
     * @param headB
     * @return
     */
    public ListNode point1(ListNode headA, ListNode headB){
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != null){

            while (pB != null){
                if (pA == pB){
                    return pA;
                }
                pA = pA.next;
                pB = pB.next;
            }
        }
        return null;
    }

    /**
     * 遍历链表 A 并将每个结点的地址/引用存储在哈希表中。然后检查链表 B 中的每一个结点
     *   是否在哈希表中。若在，则为相交结点。
     * @param headA
     * @param headB
     * @return
     */
    public ListNode point2(ListNode headA, ListNode headB){
        HashSet<ListNode> set = new HashSet<>();

        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != null){
            set.add(pA);
            pA = pA.next;
        }
        while (pB != null){
            if (set.contains(pB)){
                return pB;
            }
            pB = pB.next;
        }
        return null;
    }

    /**
     * 双指针法
     * 创建两个指针 pApA 和 pBpB，分别初始化为链表 A 和 B 的头结点。然后让它们向后逐结点遍历。
     * 当 pApA 到达链表的尾部时，将它重定位到链表 B 的头结点 (你没看错，就是链表 B); 类似的，当 pBpB 到达链表的尾部时，将它重定位到链表 A 的头结点。
     * 若在某一时刻 pApA 和 pBpB 相遇，则 pApA/pBpB 为相交结点。
     * @param headA
     * @param headB
     * @return
     */
    public ListNode point3(ListNode headA, ListNode headB){
      if (headA == null || headB == null){
          return null;
      }
      ListNode pA = headA;
      ListNode pB = headB;
      while (pA != pB){
          pA = pA.next;
          pB = pB.next;
          if (pA == null && pB == null){
              return null;
          }
          if (pA == null){
              pA = headB;
          }
          if (pB == null){
              pB = headA;
          }
      }
        return pA;
    }

}
