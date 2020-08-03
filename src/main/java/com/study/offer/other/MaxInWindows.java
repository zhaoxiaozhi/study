package com.study.offer.other;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class MaxInWindows {

    public ArrayList<Integer> getMaxInWindows(int[] num, int size) {

        /**
         * 使用双端队列实现
         */
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || num.length < 1 || size <= 0 || size > num.length) {
            return res;
        }
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            while (!queue.isEmpty() && queue.peek() < i - size + 1) {//超出范围的去掉
                queue.poll();
            }
            //当当前值大于之前值，删掉之前值
            while ((!queue.isEmpty() && num[i] >= num[queue.getLast()])) {
                queue.removeLast();
            }
            queue.add(i);
            if (i >= size - 1) {
                res.add(num[queue.peek()]);
            }

        }
        return res;
    }

}
