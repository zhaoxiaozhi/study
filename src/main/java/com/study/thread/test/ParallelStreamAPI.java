package com.study.thread.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamAPI {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            nums.add(1000000 + r.nextInt(1000000));
        }
        long start = System.currentTimeMillis();
        nums.forEach(v -> isPrime(v));
        long end = System.currentTimeMillis();
        System.out.println(" e - s=" + (end - start));


        System.out.println("---");
        start = System.currentTimeMillis();
        nums.parallelStream().forEach(e -> isPrime(e));
        end = System.currentTimeMillis();
        System.out.println("e - s 2=" + (end - start));

    }

    static boolean isPrime(int num){

        for (int i = 2; i < num /2; i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
