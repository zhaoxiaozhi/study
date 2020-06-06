package com.study.arethmetic.javaguide.common;

import com.study.arethmetic.javaguide.util.ListNode;

/**
 * 几道常见算法
 */
public class CommonCount {

    public static int Fibonacci01(int n){

        if (n <= 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        else {
            return Fibonacci01(n-1) + Fibonacci01(n - 2);
        }
    }

    public static int Fibonacci02(int n){

        if (n == 0){
            return 0;
        }
        if (n == 1 || n == 2){
            return 1;
        }
        int first = 1, second = 1, third = 0;
        for (int i = 3; i <= n; i++){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    public static  int jumpFloor(int number){
        if (number <= 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }
        if (number == 2){
            return 2;
        }
        int first = 1, second = 2, third = 0;
        for (int i = 3; i < number; i ++){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * f(n)=2^(number-1)
     * @param number
     * @return
     */
    static int JumpFloorII(int number){
      return 1 << --number;
    }

    public static boolean Find(int target, int [][] array){
        //基本思路从左下角开始找，这样速度最快
        int row = array.length - 1;  //行
        int column = 0;   //列
        //当行数大于0，当前列数小于总列数时循环条件成立
        while ((row >= 0) && (column < array[0].length)){
            if (array[row][column] > target){
                row --;
            }else if (array[row][column] < target){
                column++;
            }else {
                return true;
            }
        }
        return false;
    }

    //给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
    public static double Power(double base,  int exponent){


        return 0;
    }

    public static double powerAnother(double base, int exponent){

        double result = 1.0;
        for (int i = 0; i < Math.abs(exponent); i++){
            result *=base;
        }
        if (exponent >= 0){
            return  result;
        } else {
            return 1/result;
        }

    }

    /**
     * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
     * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     * @param array
     */
    public void reOrderArray(int[] array){

        if (array.length == 0 || array.length == 1){
            return;
        }

        int oddCount = 0, oddBegin = 0;
        //新建数组
        int[] newArray = new int[array.length];
        //计算出（数组中的奇数个数）开始添加元素
        for (int i = 0; i < array.length; i++) {
            if ((array[i]&1) == 1){
                oddCount++;
            }
        }
        for (int i = 0; i < array.length; i++){
            //如果数为基数新数组从头开始添加元素
            //如果为偶数就从oddCount（数组中的奇数个数）开始添加元素
            if ((array[i]&1) == 1){
                newArray[oddBegin++] = array[i];
            }else {
                newArray[oddCount++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i ++){
            array[i] = newArray[i];
        }
    }


    /**
     * 输入一个链表，输出该链表中倒数第k个结点
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode pre = null,p = null;
        p = head;
        pre = head;
        int a = k;
        int count = 0;

        //p指针先跑，并且记录节点数，当p指针跑了k-1个节点后，pre指针开始跑，
        //当p指针跑到最后时，pre所指指针就是倒数第k个节点
        while (p != null){
            p = p.next;
            count ++;
            if (k < 1){
                pre = pre.next;
            }
            k --;
        }
        //如果节点个数小于所求的倒数第k个节点，则返回空
        if (count < a){
            return null;
        }
        return pre;
    }

    //翻转链表
    public ListNode ReverseList(ListNode head) {

        ListNode next = null;
        ListNode pre = null;
        while (head != null){
            //保存要反转到头来的那个节点
            next = head.next;
            //要反转的那个节点指向已经反转的上一个节点
            head.next = pre;
            //上一个已经反转到头部的节点
            pre = next;
            //一直向链表尾走
            head = next;
        }
        return null;
    }

    public ListNode Merge(ListNode list1, ListNode list2){
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode mergeHead = null;
        ListNode current = null;
        while (list1 != null && list2 != null){
            //取较小值做头结点
            if (list1.val <= list2.val){
                if (mergeHead == null){
                    mergeHead = current = list1;
                }else {
                    current.next = list1;
                    //current节点保存list1节点的值因为下一次还要用
                    current = list1;
                }
                list1 = list1.next;
            }else {
                if (mergeHead == null){
                    mergeHead = current = list2;
                }else {
                    current.next = list2;
                    current = list2;
                }
                list2 = list2.next;
            }
            if (list1 == null){
                current.next = list2;
            }else {
                current.next = list1;
            }
            return mergeHead;

        }



        return null;
    }



    public static void main(String[] args) {
        System.out.println(JumpFloorII(10));
    }


}
