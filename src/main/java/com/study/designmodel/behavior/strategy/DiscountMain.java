package com.study.designmodel.behavior.strategy;

import java.awt.*;
import java.math.BigDecimal;

public class DiscountMain {

    public static void main(String[] args) {
        DiscountContext ctx = new DiscountContext();

        //默认使用普通会员折扣
        BigDecimal pay1= ctx.calculatePrice(BigDecimal.valueOf(105));
        System.out.println(pay1);

        //使用满减
        ctx.setStrategy(new OverDiscountStrategy());
        BigDecimal pay2 = ctx.calculatePrice(BigDecimal.valueOf(105));


    }
}
