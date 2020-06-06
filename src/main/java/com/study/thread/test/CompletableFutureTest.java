package com.study.thread.test;

import org.omg.CORBA.TIMEOUT;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureTest {

    public static void main(String[] args) throws Exception{

        long start, end;

//        end = System.currentTimeMillis();
//        System.out.println("use serial method call !" + (end - start));

//        start = System.currentTimeMillis();
//        priceOfJD();
//        priceOfTM();
//        priceOfTM();

        start = System.currentTimeMillis();
        CompletableFuture<Double> futureTB = CompletableFuture.supplyAsync(()
                -> priceOfTB());
        CompletableFuture<Double> futureTM = CompletableFuture.supplyAsync(()
                -> priceOfTM());
        CompletableFuture<Double> futureJD = CompletableFuture.supplyAsync(()
                -> priceOfJD());
        CompletableFuture.allOf(futureTB,futureTM, futureJD);
        CompletableFuture.supplyAsync(() -> priceOfTM())
                .thenApply(String :: valueOf)
                .thenApply(str -> "price" + str)
                .thenAccept(System.out:: println);
        end = System.currentTimeMillis();

        System.out.println("使用时间=" + (end - start));
       try {
           System.in.read();
       }catch (Exception e){
           e.printStackTrace();
       }
    }


    private static double priceOfTB(){
        delay();
        return 1.00;
    }

    private static double priceOfTM(){
        delay();
        return 2.00;
    }

    private static double priceOfJD(){
        delay();
        return 3.0;
    }

    private static void delay(){
        int time = new Random().nextInt(500);
        try {
            TimeUnit.MILLISECONDS.sleep(time);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("After %s sleep= " + time);
    }


}
