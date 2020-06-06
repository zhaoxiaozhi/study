package com.study.designmodel.behavior.template;

public class Setting {

    public final String getSetting(String key) {
        String value = readFromDatabase(key);
        return value;
    }

    private String readFromDatabase(String key) {
        // TODO: 从数据库读取
        return key;
    }

}
