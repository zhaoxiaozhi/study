package com.study.thread.local;
import java.util.concurrent.TimeUnit;

public class ThreadLocalTest {
    static ThreadLocal<Person> t1 = new ThreadLocal<>();
    public static void main(String[] args) {

        new Thread(() -> {
           try {
               TimeUnit.SECONDS.sleep(2);
           }catch (Exception e){
               e.printStackTrace();
           }
            System.out.println("===" + t1.get());
        }).start();
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (Exception e){
                e.printStackTrace();
            }
            t1.set(new Person());
            Person p = new Person();
//            p.name = "小芳";
//            t1.set(p);
            System.out.println(t1.get().name);
        }).start();
    }



    static class  Person{
        String name = "张三";
    }

}
