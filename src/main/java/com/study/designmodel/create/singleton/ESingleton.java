package com.study.designmodel.create.singleton;

public class ESingleton {

    private static final ESingleton INSTANCE = new ESingleton();

    public static ESingleton getInstance(){
        return INSTANCE;
    }
    private ESingleton(){
    }
}
