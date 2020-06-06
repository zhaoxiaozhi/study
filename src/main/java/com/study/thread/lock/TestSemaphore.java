package com.study.thread.lock;

import java.util.concurrent.Semaphore;

public class TestSemaphore {

    public static void main(String[] args) {

        Semaphore s = new Semaphore(5);
        for (int i = 0; i < 8; i++) {
            new Worker(i, s).start();
        }
    }

    static class Worker extends Thread{

        private int num;
        private Semaphore semaphore;
        public Worker(int num, Semaphore semaphore){
            this.num = num;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();       //抢许可
                Thread.sleep(2000);
                semaphore.release();        //释放许可
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
