package com.study.designmodel.behavior.observer;

public interface ProductObserver {


    void onPublished(Product p);

    void onPriceChanged(Product p);

}
