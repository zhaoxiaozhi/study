package com.study.offer.other;

import java.util.ArrayList;

public class FindContinuousSequence {

    public ArrayList<ArrayList<Integer>> findContinuousSequenc(int sum) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int low = 1, high = 2; //窗口的初始指针
        int curSum = low + high;//当前窗口元素之和

        while (low < high && low < (sum + 1) / 2) {
            if (curSum == sum) { //相等，说明找到一个序列
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i = low; i <= high; i++) {
                    temp.add(i);
                }
                res.add(temp);
                curSum -= low;
                ++low;
            } else if (curSum > sum) { //当前和大于sum，左指针右移，减去一个小值
                curSum -= low;
                ++low;
            } else {
                ++high;
                curSum += high;
            }
        }
        return res;
    }

    /**
     * 数组M=[1,2,3,4,5,6,15,20,30,40,50,...139...]
     * 求和=N的组合
     * 例如：N=35
     * <p>
     * 15+20
     * 10+5+20
     * 6+4+25
     * 6+4+20+5
     *
     * @param sum
     * @param array
     * @return
     */
    public ArrayList<ArrayList<Integer>> findNum(int sum, int[] array) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int low = 0;
        int high = 1;
        int curSum = array[low] + array[high];
        while (low < high && high < array.length && sum> array[high]) {
            if (curSum == sum) {
                ArrayList<Integer> temp = new ArrayList<>();
                for (int i = low; i <= high; i++) {
                    temp.add(array[i]);
                }
                res.add(temp);
                curSum -= array[low];
                ++low;
            } else if (curSum > sum) {
                curSum -= array[low];
                ++low;
            } else {
                ++high;
                curSum += array[high];
            }

        }
    return res;
    }

}