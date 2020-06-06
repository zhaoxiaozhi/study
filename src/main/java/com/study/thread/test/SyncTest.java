package com.study.thread.test;

import java.util.concurrent.locks.LockSupport;

public class SyncTest {




    public static void main(String[] args) {

        char[] ai = "123456".toCharArray();
        char[] ac = "ABCDEF".toCharArray();

       final Object o = new Object();
        new Thread(() -> {

            synchronized (o) {
                for (char c : ai) {
                    System.out.println(c);
                    try {
                        o.notify();
                        o.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
                o.notify();
            }
        }, "t1").start();

        new Thread(() -> {

            synchronized (o) {
                for (char c : ac) {
                    System.out.println(c);
                    try {
                        o.notify();
                        o.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                o.notify();
            }
        }, "t2").start();
    }

}
