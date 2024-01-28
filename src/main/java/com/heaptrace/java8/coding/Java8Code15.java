package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Code15 {
    public static void main(String[] args) {
        //Given a list of strings, sort them according to increasing order of their length?
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
