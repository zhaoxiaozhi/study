package com.study.thread.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {

//    public static void main(String[] args) {
//        ExecutorService es = Executors.newFixedThreadPool(4);
//        for (int i = 0; i < 6; i ++){
//            es.submit(new Task(" " + i));
//        }
//        es.shutdown();
//    }


    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(4);
// 定义任务:
        Callable<String> task = new TaskC();
// 提交任务并获得Future:
        Future<String> future = executor.submit(task);
// 从Future获取异步执行返回的结果:
        String result = future.get(); // 可能阻塞
        System.out.println(result);
    }

}
