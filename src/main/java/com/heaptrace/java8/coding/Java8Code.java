package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8Code {
    public static void main(String[] args) {
        //Given a list of integers, separate odd and even numbers?
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> separateOddEven = listOfIntegers.stream().collect(Collectors.partitioningBy(integer -> integer % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entries = separateOddEven.entrySet();
        for (Map.Entry<Boolean, List<Integer>> entry : entries){
            if(entry.getKey()){
                System.err.println("Even numbers");
                System.err.println("-----------------------");
            }else {
                System.err.println("Odd numbers");
                System.err.println("-----------------------");
            }

            List<Integer> value = entry.getValue();
            for (Integer integer : value){
                System.err.println(integer);
            }
        }
    }
}
