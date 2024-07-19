package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        Set<String> keySet = sourceMap.keySet();
        for (String s:keySet){
            int length = s.length();
            if (result.containsKey(length)){
                result.get(length).add(s);
            }
            else{
                Set<String> set = new HashSet<>();
                set.add(s);
                result.put(length, set);
            }
        }
        return result;
    }
}
