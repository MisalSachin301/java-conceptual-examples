package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Code6 {
    public static void main(String[] args) {
        //Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedString);
    }
}
