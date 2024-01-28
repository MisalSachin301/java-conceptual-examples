package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Code14 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer secondLargestNumber = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondLargestNumber);
    }
}
