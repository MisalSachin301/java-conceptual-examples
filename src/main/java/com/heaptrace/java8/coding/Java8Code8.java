package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8Code8 {
    public static void main(String[] args) {
        //Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer maximumNumber = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        Integer minimumNumber = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.err.println(maximumNumber+" "+minimumNumber);
    }
}
