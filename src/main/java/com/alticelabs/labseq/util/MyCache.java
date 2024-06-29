package com.alticelabs.labseq.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class MyCache {

    private static MyCache instance;

    private Map<Integer, Integer> cache = new HashMap<>();

    private MyCache() {
    }

    public static MyCache getInstance() {
        if (Objects.isNull(instance)) {
            instance = new MyCache();
        }

        return instance;
    }

    public Optional<Integer> getNum(int num) {
        if (cache.containsKey(num)) {
            return Optional.of(cache.get(num));
        }

        return Optional.empty();
    }

    public void addNum(int num, int value) {
        cache.put(num, value);
    }

}
