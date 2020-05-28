package com.study.designmodel.create.singleton;

/**
 * java保证枚举类的每个枚举都是单例，所以我们只要编写一个只有一个枚举的类即可
 */
public enum  EnumSingleton {

    INSTANCE;

    private String name = "world";

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
