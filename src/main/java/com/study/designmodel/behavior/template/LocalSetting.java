package com.study.designmodel.behavior.template;

import java.util.HashMap;
import java.util.Map;

public class LocalSetting extends AbstractSetting {
    private Map<String, String> cache = new HashMap<>();

    protected String lookupCache(String key) {
        return cache.get(key);
    }

    @Override
    protected void putInfoCache(String key, String value) {
        cache.put(key, value);
    }
}
