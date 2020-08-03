package com.study.offer.digui;

public class RectCover {

    public int RectCover(int target){
        if (target <=  2){
            return target;
        }
        int first = 1, second = 2, res = 0;
        for (int i = 3; i <  target; i++){
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
}
