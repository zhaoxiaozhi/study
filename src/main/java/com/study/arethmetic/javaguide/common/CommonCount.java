package com.study.arethmetic.javaguide.common;

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

    public static double Power(double base,  int exponent){

        return 0;
    }


    public static void main(String[] args) {
        System.out.println(JumpFloorII(10));
    }


}
