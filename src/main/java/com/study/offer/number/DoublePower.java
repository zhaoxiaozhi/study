package com.study.offer.number;

public class DoublePower {

    public double Power(double base, int exponent){

        //除2计算
        if (exponent == 0){
            return 1.0;
        }
        if (exponent == 1){
            return base;
        }
        if (exponent == -1){
            return 1.0 / base;
        }
        double half = Power(base, exponent / 2);
        return half * half * Power(base, exponent % 2);
    }

}
