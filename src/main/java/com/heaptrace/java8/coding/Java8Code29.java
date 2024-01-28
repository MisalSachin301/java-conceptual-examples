package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.List;

public class Java8Code29 {
    public static void main(String[] args) {
        //How do you get last element of an array?
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        String lastElement = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.err.println(lastElement);
    }
}
