package com.heaptrace.java8.coding;

import java.util.stream.IntStream;

public class Java8Code19 {
    public static void main(String[] args) {
        //How do you find sum of first 10 natural numbers?
        int sum = IntStream.range(1, 11).sum();
        System.out.println(sum);
    }
}
