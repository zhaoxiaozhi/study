package com.study.offer.digui;

public class Fibonacci {

    public static int fibonacci1(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        int first = 0, second = 1, res = 0;
        for (int i = 2; i <= n; i++){
            res = first + second;
            first = second;
             second = res;
        }
        return res;
    }
    public static int fibonacci2(int n){
        if ( n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return  fibonacci2(n -1) + fibonacci2(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci2(10));
    }
}
