package com.study.thread.test;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.study.thread.pool.Task;

import java.util.concurrent.*;

public class TaskTest implements Runnable{

    private int i;
    public TaskTest(int i){
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Task " + i);
        try {
           System.in.read();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Task{" + "i=" + i + "}";
    }

    public static void main(String[] args) {

        ThreadFactory factory = new ThreadFactoryBuilder().setNameFormat("stats-pol-%d").build();
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(2, 4, 60, TimeUnit.SECONDS,
        new ArrayBlockingQueue<Runnable>(4), factory
        ,new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 8; i++){
            tpe.execute(new TaskTest(i));
        }
        System.out.println(tpe.getQueue());
        tpe.execute(new TaskTest(100));
      //  System.out.println(tpe.getQueue());
        tpe.shutdown();

    }
}
