package com.study.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {

    private final Lock lock = new ReentrantLock();
    private int count;

    public void add(int n){

        lock.lock();
        try {
            count += n;
        }finally {
            lock.unlock();
        }
    }

}
