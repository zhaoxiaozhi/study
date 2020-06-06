package com.study.thread.lock;

import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {

    private CyclicBarrier cyclicBarrier = new CyclicBarrier(5);

    public static void main(String[] args) {

    }

    public void begin(){
        for (int i = 0; i < 5; i++) {
       new Thread(new Student()).start();
        }
    }

    private class Student implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(2000);   //该学生在赶往饭店的路上
                cyclicBarrier.await();  //到了等着，其他人都到了进饭店
            }catch (Exception e){
                e.printStackTrace();
            }
            //大家都到了，去吃饭
        }
    }

}
