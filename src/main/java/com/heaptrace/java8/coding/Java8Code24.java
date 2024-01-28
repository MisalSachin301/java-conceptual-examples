package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Code24 {
    public static void main(String[] args) {
        //Print duplicate characters in a string?
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        System.err.println(inputString);
        Set<String> uniqueChars = new HashSet<>();
        Set<String> duplicateCharacterInString = Arrays.stream(inputString.split("")).filter(str -> !uniqueChars.add(str)).collect(Collectors.toSet());
        System.err.println(duplicateCharacterInString);
    }
}
