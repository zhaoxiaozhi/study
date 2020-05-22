package com.study.enums;

public class SingletonObject {

    private SingletonObject(){

    }

    private enum Singleton{

        INSTANCE;

        private final SingletonObject instance;
        Singleton(){
            instance = new SingletonObject();
        }

        private SingletonObject getInstance(){
            return instance;
        }

    }

    public static SingletonObject getInstance(){

        return Singleton.INSTANCE.getInstance();
    }

}
