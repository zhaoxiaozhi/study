package com.study.thread.pool;

public class ThreadLocalDemo {

    static ThreadLocal<String> threadLocalStr = new ThreadLocal<>();

    public static void main(String[] args) {
        try {
            threadLocalStr.set("aaaaa");
            fun();
        }finally {
            threadLocalStr.remove();
            fun();
        }

    }
    public static void fun(){

        System.out.println(threadLocalStr.get());
    }

}
