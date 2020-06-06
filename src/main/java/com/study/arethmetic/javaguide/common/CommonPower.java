package com.study.arethmetic.javaguide.common;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class CommonPower {

    boolean invalidInput = false;
    public double Power(double base, int exponent){

        //如果底数等于0并且指数小于0
        //由于base为double型，不能直接用==判断
        if (equal(base,0.0) && exponent < 0){
            invalidInput = true;
            return 0.0;
        }
        int absexponent = exponent;
        if (exponent < 0){
            absexponent = -exponent;
        }
        double res = getPower(base, absexponent);
        if (exponent < 0){
            res = 1.0/res;
        }
        return res;
    }


    /**
     * 判断两个double类型是否相等的方法
     * @param num1
     * @param num2
     * @return
     */
    boolean equal(double num1, double num2){

        if (num1-num2 > -0.000001 && num1 - num2 < 0.000001){
            return true;
        }else {
            return false;
        }
    }

    //求b的e次方的方法
    double getPower(double b, int e){
        if (e == 0){
            return 1.0;
        }
        if (e == 1){
            return b;
        }
        //e >> 1 相当于e/2,这里就是求a^n =（a^n/2）*（a^n/2）
        double result = getPower(b, e >> 1);
        result *= result;
        //如果指数n为奇数，则要再乘一次底数base
        if ((e & 1) == 1){
            result*=b;
        }
        return result;
    }

}
