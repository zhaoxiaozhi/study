package com.study.designmodel.structure.bradge;

/**
 * 首先把Car按品牌进行子类化
 */
public abstract class Car {

    protected Engin engin;

    public Car(Engin engin){
        this.engin  = engin;
    }
    public abstract void drive();

}
