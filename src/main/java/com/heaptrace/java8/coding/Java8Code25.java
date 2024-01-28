package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Code25 {
    public static void main(String[] args) {
        //Find first repeated character in a string?
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Map<String, Long> charCountMap = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        String repeatedCharacter = charCountMap.entrySet().stream().filter(entry -> entry.getValue() > 1).map(ch -> ch.getKey()).findFirst().get();
        System.err.println(repeatedCharacter);

        String str = "JavaConceptOfTheDay";
        Map<String, Long> charCountMap2 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        String repeatedCharacter2 = charCountMap2.entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey()).findFirst().get();
        System.err.println(repeatedCharacter2);
    }
}
