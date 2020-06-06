package com.study.designmodel.behavior.template;

public abstract class AbstractSetting {

    public final String getSetting(String key){
        String value = lookupCache(key);
        if (value == null){
            value = readFromDatabase(key);
            putInfoCache(key, value);
        }
       return value;
    }
    private String readFromDatabase(String key) {
        // TODO: 从数据库读取
        System.out.println("从数据库读取");
        return key;
    }

    protected abstract String lookupCache(String key);
    protected abstract void putInfoCache(String key, String value);
}
