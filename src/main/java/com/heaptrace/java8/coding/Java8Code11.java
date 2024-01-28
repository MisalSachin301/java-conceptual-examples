package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Code11 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.err.println("Three minimum number");
        List<Integer> threeMinimumNumbers = listOfIntegers.stream().sorted().limit(3).toList();
        System.err.println(threeMinimumNumbers);
        List<Integer> threeMaximumNumbers = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.err.println("Three maximum number");
        System.err.println(threeMaximumNumbers);
    }
}
