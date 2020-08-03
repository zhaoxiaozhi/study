package com.study.offer.other;

public class NumberOf1 {

    public int fun1(int n){

        int flag = 1;
        int count = 0;
        while (flag != 0){
            if ((flag & n) != 0){
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }

    //方法二：计算与n-1相与的次数
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1); //相与一次，去掉一个1
            count++;
        }
        return count;
    }

}
