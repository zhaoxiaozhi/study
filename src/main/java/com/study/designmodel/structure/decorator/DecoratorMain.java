package com.study.designmodel.structure.decorator;

/**
 * 装饰器（Decorator）模式，是一种在运行期动态给某个对象的实例增加功能的方法。
 * Decorator模式的目的就是把一个一个的附加功能，用Decorator的方式给一层一层地累加到原始数据源上，最终，通过组合获得我们想要的功能。
 */
public class DecoratorMain {
    /**
     * 我们还是举个栗子：假设我们需要渲染一个HTML的文本，但是文本还可以附加一些效果，比如加粗、变斜体、加下划线等。为了实现动态附加效果，可以采用Decorator模式。
     * @param args
     */
    public static void main(String[] args) {
        TextNode n1 = new SpanNode();
        TextNode n2 = new BoldDecorator(new UnderlineDecorator(new SpanNode()));
        TextNode n3 = new ItalicDecorator(new BoldDecorator(new SpanNode()));
        n1.setText("Hello");
        n2.setText("Decorate");
        n3.setText("World");
        System.out.println(n1.getText());
// 输出<span>Hello</span>

        System.out.println(n2.getText());
// 输出<b><u><span>Decorated</span></u></b>

        System.out.println(n3.getText());
// 输出<i><b><span>World</span></b></i>
    }

}
