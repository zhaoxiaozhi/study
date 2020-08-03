package com.study.offer.number;

public class Sum_Solution {

    public static int sum(int n){

        //利用逻辑与的短路特性实现地柜 终止

        int sum =  n;
        boolean ans = (n > 0) &&((sum += sum(n-1)) >0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }


    public int add(int num1, int num2){
        //非递归
        int sum = 0, carry = 1;
        while (carry != 0){  //进位不等于0就循环加
            sum = num1 ^ num2;
            carry = (num1& num2) <<1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }

    public int add2(int num1, int num2){
        if (num2 == 0){
            return num1;
        }
        int sum = num1 ^ num2;
        int carry = (num1 & num2) << 1;
        return add2(sum, carry);
    }

}
