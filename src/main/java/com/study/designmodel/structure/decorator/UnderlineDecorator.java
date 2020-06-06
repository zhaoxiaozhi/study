package com.study.designmodel.structure.decorator;

public class UnderlineDecorator extends NodeDecorator{
    public UnderlineDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<u>" + target.getText() + "</u>";
    }
}