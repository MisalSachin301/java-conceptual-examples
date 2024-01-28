package com.heaptrace.java8.coding;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Code3 {
    public static void main(String[] args) {
        //How do you find frequency of each character in a string using Java 8 streams?
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> charCountMap =
                inputString.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        charCountMap.entrySet().stream().filter(map -> map.getValue() > 1).forEach(map -> System.out.println("character: "+map.getKey()+" count: "+map.getValue()));


//        char[] charArray = inputString.toCharArray();
//        Map<Character,Integer> map = new HashMap<>();
//        for (char ch : charArray){
//            if(map.containsKey(ch))
//                map.put(ch, map.get(ch) + 1);
//            else
//                map.put(ch, 1);
//        }
//        System.out.println(map);
//
//        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Character, Integer> entry : entrySet){
//            if(entry.getValue() > 1){
//                System.err.println(entry.getKey()+" = "+entry.getValue());
//            }
//        }
    }
}
