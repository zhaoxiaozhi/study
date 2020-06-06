package com.study.thread.lock;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {

    private CountDownLatch countDownLatch = new CountDownLatch(4); //构造方法指明计数数量

    public static void main(String[] args) {
        new TestCountDownLatch().begin();
    }

    private class Runner implements Runnable{
        private int result;
        private Runner(int result){
            this.result = result;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(result * 1000); //模拟跑了多少秒
                countDownLatch.countDown(); //跑完了就计数器减1
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private void begin(){
        System.out.println("比赛开始了");
        Random random = new Random((System.currentTimeMillis()));
        for (int i = 0; i < 4; i ++){
            int result = random.nextInt(3) + 1; //随机设置每个运动员跑多久计数
            new Thread(new Runner(result)).start();
        }
        try {
            countDownLatch.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("跑完了");

    }

}
