package com.study.offer.other;

import java.util.ArrayList;

public class FindNumbersWithSum {

    public ArrayList<Integer> FindNumbersWithSum1(int [] array, int sum){


        ArrayList<Integer> res = new ArrayList<>();
        int low = 0, high = array.length-1;
        while (low < high){
            int curSum = array[low] + array[high];
            if (curSum == sum){
                res.add(array[high]);
                res.add(array[low]);
                break;
            }else if (curSum < sum){
                low ++;
            }
            else {
                high  --;
            }
        }
        return res;
    }
}
