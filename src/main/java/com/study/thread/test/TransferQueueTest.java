package com.study.thread.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class TransferQueueTest {

    public static void main(String[] args) {
        char[] ai = "123456".toCharArray();
        char[] ac = "ABCDEF".toCharArray();

        TransferQueue<Character> queue = new LinkedTransferQueue<Character>();
        new Thread(() -> {

            try {
                for (char c : ai){
                    System.out.println(queue.take());
                    queue.transfer(c);
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }, "t1").start();

        new Thread(() -> {

            try {
                for (char c : ac){
                    queue.transfer(c);
                    System.out.println(queue.take());
                }
            }catch (Exception e){
                e.printStackTrace();
            }

        }, "t2").start();
    }

}
