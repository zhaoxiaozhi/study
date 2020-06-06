package com.study.designmodel.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private static final Map<String, Student> cache = new HashMap<>();

    public static Student create(int id, String name){

        String key = id + "\n" + name;
        //先查找缓存
        Student std = cache.get(key);
        if (std == null){
            System.out.println(String.format("create new Student(%s, %s)", id, name));
            std = new Student(id, name);
            cache.put(key, std);
        }else {
            // 缓存中存在:
            System.out.println(String.format("return cached Student(%s, %s)", std.id, std.name));
        }
        return std;
    }


}
