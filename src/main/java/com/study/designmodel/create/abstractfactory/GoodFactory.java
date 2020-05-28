package com.study.designmodel.create.abstractfactory;

public class GoodFactory implements AbstractFactory{
    @Override
    public HtmlDocument createHtml(String md) {
        return null;
    }

    @Override
    public WordDocument createWord(String md) {
        return null;
    }
}
