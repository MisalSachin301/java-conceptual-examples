package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.List;

public class Java8Code22 {
    public static void main(String[] args) {
        //Given a list of strings, find out those strings which start with a number?
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);

        for(String str : listOfStrings){
            if(Character.isDigit(str.charAt(0)))
                System.err.println(str);
        }
        System.out.println();

        listOfStrings.stream().filter(str -> !Character.isDigit(str.charAt(0))).forEach(System.out::println);
    }
}
