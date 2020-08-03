package com.study.offer.other;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MiddleNumSolution {

    /**
     * 思路:最大堆 最小堆
     */

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
    int count = 0;
    public void insert(Integer num){
        count++;
        if (count % 2 == 0){  //偶数，插入最小堆
            if (!maxHeap.isEmpty() && num < maxHeap.peek()){ //如果num小于最大堆，那么先插入最大堆
                maxHeap.add(num);
                num = maxHeap.poll();
            }
            minHeap.add(num);
        }else {  //奇数，插入最大堆
            if (!minHeap.isEmpty() && num > minHeap.peek()){
                minHeap.add(num);
                num=minHeap.poll();
            }
            maxHeap.add(num);
        }

    }

    public Double getMedian(){
        if (minHeap.size() == maxHeap.size()){
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }else if (maxHeap.size()  > minHeap.size()){
            return maxHeap.peek() / 1.0;
        }else {
            return minHeap.peek() / 1.0;
        }
    }

}
