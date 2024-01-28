package com.heaptrace.sort;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByKeys {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("EEE",1);
        map.put("AAA",5);
        map.put("BBB",4);
        map.put("CCC",3);
        map.put("DDD",2);

        Map<String,Integer> treeMap = new TreeMap<>(map);
        System.err.println(treeMap);

        LinkedHashMap<String, Integer> sortMapByKeysAsc = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.err.println(sortMapByKeysAsc);

        LinkedHashMap<String, Integer> sortMapByKeysDesc = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.err.println(sortMapByKeysDesc);

        LinkedHashMap<String, Integer> sortMapByValuesAsc = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.err.println(sortMapByValuesAsc);

        LinkedHashMap<String, Integer> sortMapByValuesDesc = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.err.println(sortMapByValuesDesc);

    }
}
