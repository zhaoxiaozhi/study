package com.study.thread.test;

import java.util.concurrent.locks.LockSupport;

public class LockSupportTest {


    static Thread t1 = null, t2 = null;


    public static void main(String[] args) {

        char[] ai = "123456".toCharArray();
        char[] ac = "ABCDEF".toCharArray();

        t1 = new Thread(() -> {
            for (char c : ai){
                System.out.println(c);
                LockSupport.unpark(t2);
                LockSupport.park();
            }
        }, "t1");

        t2 = new Thread(() -> {
            for (char c : ac){
                System.out.println(c);
                LockSupport.park();
                LockSupport.unpark(t1);
            }
        }, "t2");
        t1.start();
        t2.start();
    }
}
