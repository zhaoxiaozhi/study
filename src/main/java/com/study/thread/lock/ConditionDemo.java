package com.study.thread.lock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionDemo {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private Queue<String> queue = new LinkedList<>();

    public void addTasks(String s){

        lock.lock();
        try {
            queue.add(s);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public String getTasks() throws Exception{
        lock.lock();
        try {
            while (queue.isEmpty()){
                condition.await();
            }
            return queue.remove();
        }finally {
            lock.unlock();
        }
    }


}
