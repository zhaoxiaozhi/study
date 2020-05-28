package com.study.designmodel.create.singleton;

public class BSingleton {

    private static volatile BSingleton INSTANCE = new BSingleton();

    public static BSingleton getInstance(){

//        if (INSTANCE == null){
//            INSTANCE = new BSingleton();
//        }
//        return INSTANCE;
        if (INSTANCE == null){
            synchronized (BSingleton.class){
                if (INSTANCE == null){
                    INSTANCE = new BSingleton();
                }
            }
        }
        return INSTANCE;
    }

    private BSingleton(){

    }
}
