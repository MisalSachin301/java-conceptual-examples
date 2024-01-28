package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Java8Code10 {
    public static void main(String[] args) {
        //How do you merge two unsorted arrays into single sorted array without duplicates?
        int[] a = new int[] {4, 2, 5, 1};
        int[] b = new int[] {8, 1, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));

        List<String> list = List.of("1", "2", "3", "3", "4");
        list.stream().sorted().distinct().forEach(System.out::println);
    }
}
