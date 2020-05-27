package com.study.thread.pool;

import java.util.concurrent.CompletableFuture;

/**
 * 异步任务结束时，会自动回调某个对象的方法；
 * 异步任务出错时，会自动回调某个对象的方法；
 * 主线程设置好回调后，不再关心异步任务的执行。
 */
public class CompletableFutureDemo {

//    public static void main(String[] args) throws Exception{
//
//        CompletableFuture<Double> cf = CompletableFuture.supplyAsync(CompletableFutureDemo::fetchPrice);
//
//        cf.thenAccept((result) -> {
//            System.out.println("price" + result);
//        });
//
//        cf.exceptionally((e) -> {
//            e.printStackTrace();
//            return null;
//        });
//        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
//        Thread.sleep(200);
//    }
//
//    static Double fetchPrice() {
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        if (Math.random() < 0.3) {
//            throw new RuntimeException("fetch price failed!");
//        }
//        return 5 + Math.random() * 20;
//    }

    public static void main(String[] args) throws Exception {
        // 第一个任务:
        CompletableFuture<String> cfQuery = CompletableFuture.supplyAsync(() -> {
            return queryCode("中国石油");
        });
        // cfQuery成功后继续执行下一个任务:
        CompletableFuture<Double> cfFetch = cfQuery.thenApplyAsync((code) -> {
            return fetchPrice(code);
        });
        // cfFetch成功后打印结果:
        cfFetch.thenAccept((result) -> {
            System.out.println("price: " + result);
        });
        // 主线程不要立刻结束，否则CompletableFuture默认使用的线程池会立刻关闭:
        Thread.sleep(2000);
    }

    static String queryCode(String name) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        return "601857";
    }

    static Double fetchPrice(String code) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        return 5 + Math.random() * 20;
    }
}
