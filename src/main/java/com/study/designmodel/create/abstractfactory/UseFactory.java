package com.study.designmodel.create.abstractfactory;

import java.nio.file.Paths;

public class UseFactory {

    public void fun1() throws Exception{
        AbstractFactory factory = new GoodFactory();
        HtmlDocument html = factory.createHtml("Hello\\nHello, world!");
        html.save(Paths.get(".", "fast.html"));
      // 生成Word文档:
        WordDocument word = factory.createWord("#Hello\nHello, world!");
        word.save(Paths.get(".", "fast.doc"));
    }

    public void fun2(){



    }





}
