package com.study.thread.lock;

import java.util.concurrent.locks.StampedLock;

public class StampedSample {

    private final StampedLock s1 = new StampedLock();

    void mutate(){
        long stamp = s1.writeLock();
        try{
          //  write();
        }finally {
            s1.unlockWrite(stamp);
        }
    }

    String access(){
        long stamp = s1.tryOptimisticRead();
        //String data = read();
        if (!s1.validate(stamp)){
            stamp = s1.readLock();
            try {
                //
            }finally {
                s1.unlockWrite(stamp);
            }
        }
        return null;
    }

}
