package com.study.thread.pool;

import java.util.concurrent.Callable;

public class TaskC implements Callable {
    @Override
    public Object call() throws Exception {

        return "success";
    }
}
