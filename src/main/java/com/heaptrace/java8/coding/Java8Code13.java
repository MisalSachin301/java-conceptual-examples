package com.heaptrace.java8.coding;

import java.util.stream.Stream;

public class Java8Code13 {
    public static void main(String[] args) {
        //Find sum of all digits of a number in Java 8?
        int i = 15623;
        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
        System.out.println(sumOfDigits);
    }
}
