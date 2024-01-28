package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Java8Code20 {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        for(int i = array.length-1; i >= 0; i--){
            System.err.print(array[i]+" ");
        }
        System.out.println();
        Arrays.stream(array).sorted().forEach(ele -> System.out.print(ele+" "));
        System.out.println();
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
    }
}
