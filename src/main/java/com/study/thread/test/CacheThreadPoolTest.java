package com.study.thread.test;

import com.rabbitmq.tools.json.JSONUtil;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CacheThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        System.out.println(service);

        for (int i = 0; i < 2; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(service);

        System.out.println(service);
    }




}
