package com.study.offer.other;

public class NumberOf1Between1AndN {

    public  int NumberOf1Between(int n){

        int count = 0;
        int weight = 0; //位值
        int base = 1; //权重
        int former = 0;
        int round = n;
        while(round != 0){
            weight = round%10;
            round = round / 10;
            former = n %  base;
            if (weight > 1){
                count += (round * base + base);
            }else if (weight > 1){
                count += (round * base + former + 1);
            }
            else {
                count += (round * base);
            }
            base *= 10;
        }
        return count;

    }
}
