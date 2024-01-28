package com.heaptrace.examples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("David");
        names.add("Johnson");
        names.add("Samontika");
        names.add("Brijesh");
        names.add("John");
        names.add("David");
        names.add("Brijesh");

        //Storing first 3 names in an array

        Object[] streamArray = names.stream().skip(2).limit(1).toArray();

//        System.out.println(Arrays.toString(streamArray));

//        names.stream()
//                .filter(name -> name.length() > 5)
//                .peek(e -> System.out.println("Filtered Name :"+e))
//                .map(String::toUpperCase)
//                .peek(e -> System.out.println("Mapped Name :"+e))
//                .toArray();

        Optional<String> anyElement = Stream.of("First", "Second", "Third", "Fourth").findAny();
//        System.out.println(anyElement);

        Optional<String> findFirst = names.stream().findFirst();
//        System.out.println(findFirst);

//        if(names.stream().noneMatch(name -> name.length() == 2))
//        {
//            System.out.println("There is no two letter name");
//        }

//        if(names.stream().allMatch(name -> name.length() >= 5))
//        {
//            System.out.println("All are big names");
//        }

//        for(String str : names){
//            if(str.length() > 5)
//                System.out.println(str);
//        }

        long count = names.stream().filter(name -> name.length() > 5).count();
//        System.out.println(count);

        OptionalInt max = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1,10}).max();
//        System.out.println(max);

        OptionalInt min = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).min();
        int minInt = min.getAsInt();
//        System.out.println(min + " "+minInt);

        int sum = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce(8, Integer::sum);
//        System.out.println(sum);

        int[] array = new int[]{7, 5, 9, 2, 8, 1};
        int minInteger = Arrays.stream(array).reduce(Integer::min).getAsInt();
//        System.out.println(minInteger);

//        names.stream().sorted((name1,name2) -> name1.length() - name2.length()).forEach(System.out::println);

//        names.stream().map(String::length).forEach(System.out::println);

//        names.stream().distinct().forEach(System.out::println);


    }
}
