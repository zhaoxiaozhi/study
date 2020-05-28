package com.study.designmodel.create.creater;

/**
 * 生成器模式（Builder）是使用多个“小型”工厂来最终创建出一个完整对象。
 */

/**
 * 案例：如果以#开头，使用HeadingBuilder转换；
 * 如果以>开头，使用QuoteBuilder转换；
 * 如果以---开头，使用HrBuilder转换；
 * 其余使用ParagraphBuilder转换。
 */
public class HtmlBuilder {

    private HeadingBuilder headingBuilder = new HeadingBuilder();


    public String toHtml(String markdown) {
        StringBuilder buffer = new StringBuilder();
        return buffer.toString();
    }
}
