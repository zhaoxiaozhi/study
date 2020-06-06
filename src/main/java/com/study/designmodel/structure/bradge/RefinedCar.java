package com.study.designmodel.structure.bradge;

/**
 * 在一个“修正”的抽象类RefinedCar中定义一些额外操作：
 */
public abstract class RefinedCar extends Car{

    public RefinedCar(Engin engin) {
        super(engin);
    }

    public void drive(){
        this.engin.start();
        System.out.println("Drive " + getBrand() + " car...");
    }

    public abstract String getBrand();

}
