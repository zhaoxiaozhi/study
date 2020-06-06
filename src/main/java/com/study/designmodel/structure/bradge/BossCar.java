package com.study.designmodel.structure.bradge;

public class BossCar extends RefinedCar {


    public BossCar(Engin engin){
        super(engin);
    }

    @Override
    public String getBrand() {
        return "boss";
    }
}
