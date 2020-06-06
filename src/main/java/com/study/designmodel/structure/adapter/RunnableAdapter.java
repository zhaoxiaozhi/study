package com.study.designmodel.structure.adapter;

import java.util.concurrent.Callable;

public class RunnableAdapter implements Runnable{

    //引用待转换的接口
    private Callable<?> callable;

    public RunnableAdapter(Callable<?> callable){
        this.callable = callable;

    }

    @Override
    public void run() {
        try {
            callable.call();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
