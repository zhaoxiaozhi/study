package com.study.designmodel.structure.adapter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/**
 * 适配器模式是Adapter，也称Wrapper，是指如果一个接口需要B接口，但是待传入的对象却是A接口，怎么办？
 */

/**
 * 编写一个Adapter的步骤如下：
 * 1. 实现目标接口，这里是Runnable；
 * 2. 内部持有一个待转换接口的引用，这里是通过字段持有Callable接口；
 * 3. 在目标接口的实现方法内部，调用待转换接口的方法。
 */
public class TaskMain {

    public static void main(String[] args) throws Exception{

        String[] exist = new String[] {"Good", "morning", "Bob", "and", "Alice"};
        Set<String> set = new HashSet<>(Arrays.asList(exist));
        Callable<Long> callable = new Task(12345000l);
        Thread thread = new Thread(new RunnableAdapter(callable));
        thread.start();
    }
}
