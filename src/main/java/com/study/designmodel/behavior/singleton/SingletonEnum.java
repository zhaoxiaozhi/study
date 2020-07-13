package com.study.designmodel.behavior;

public enum  SingletonEnum {

    INSTANCE;

    private String name = "hahaha";

    public String getName() {
        return name;
    }
}
