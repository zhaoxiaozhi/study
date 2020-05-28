package com.study.designmodel.create.factorymethod;

public interface NumberFactory {

    Number parse(String s);

    static NumberFactory getFactory(){
        return impl;
    }

    static NumberFactory impl = new NumberFactoryImpl();

}
