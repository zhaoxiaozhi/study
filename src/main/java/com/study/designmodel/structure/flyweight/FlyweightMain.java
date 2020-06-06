package com.study.designmodel.structure.flyweight;

/**
 *享元（Flyweight）的核心思想很简单：如果一个对象实例一经创建就不可变，
 * 那么反复创建相同的实例就没有必要，直接向调用方返回一个共享的实例就行，这样即节省内存，又可以减少创建对象的过程，提高运行速度。
 */
public class FlyweightMain {
    /**
     * 享元模式就是通过工厂方法创建对象，在工厂方法内部，很可能返回缓存的实例，而不是新创建实例，从而实现不可变实例的复用。
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Student student = Student.create(1, "zxz");
        Student student1 = Student.create(1,"zxz");
    }

}
