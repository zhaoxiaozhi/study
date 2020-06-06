package com.study.designmodel.behavior.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Strategy，是指，定义一组算法，并把其封装到一个对象中。然后在运行时，可以灵活的使用其中的一个算法。
 */
public class StrategySort {

    public static void main(String[] args) {
        String[] array = { "apple", "Pear", "Banana", "orange" };
        sort(array, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(array));
    }

    static <T> void sort(T[] a, Comparator<? super T> c){

        for(int i = 0;i < a.length - 1; i ++){
            for (int j = 0; j < a.length - i - 1; i ++){
                if (c.compare(a[j], a[j+1]) > 0){
                    T tem = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tem;
                }
            }
        }

    }



}
