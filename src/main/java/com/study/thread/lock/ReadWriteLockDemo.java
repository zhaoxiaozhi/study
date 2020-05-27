package com.study.thread.lock;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockDemo {

    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private final Lock rlock = rwLock.readLock();
    private final Lock wlock = rwLock.writeLock();
    private int[] counts = new int[10];

    public void inc(int index){
        wlock.lock(); //加写锁
        try {
            counts[index] += 1;
        }finally {
            wlock.unlock();    //释放锁
        }
    }
    public int[] get(){

        rlock.lock();
        try {
            return Arrays.copyOf(counts, counts.length);
        }finally {
            rlock.unlock();  //释放锁
        }

    }

}
