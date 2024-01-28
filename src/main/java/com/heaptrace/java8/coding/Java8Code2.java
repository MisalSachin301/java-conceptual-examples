package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Code2 {
    public static void main(String[] args) {
        // How do you remove duplicate elements from a list using Java 8 streams?
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueStrings = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueStrings);
    }
}
