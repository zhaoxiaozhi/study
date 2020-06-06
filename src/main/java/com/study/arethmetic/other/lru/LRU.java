package com.study.arethmetic.other.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU<K,V> extends LinkedHashMap<K, V> {
    //保存缓存容量
    private int capacity;

    public LRU(int capacity, float loadFactor){
        super(capacity, loadFactor, true);
        this.capacity = capacity;
    }

    /**
     * 默认的LinkedHashMap并不会移除旧元素，如果需要移除旧元素，则需要重写removeEldestEntry()方法设定移除策略；
     *
     * @param eldest
     * @return
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        //当元素个数大于缓存数量，就移除元素
        return size() > this.capacity;
    }
}
