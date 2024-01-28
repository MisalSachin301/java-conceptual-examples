package com.heaptrace.java8.coding;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Java8Code18 {
    public static void main(String[] args) {
        //Reverse each word of a string using Java 8 streams?
        String str = "Java Concept Of The Day";
        String reverseString = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(" "));
//        System.err.println(reverseString);

        String[] words = str.split(" ");
        String reverseString2 = "";
        for (String word : words) {
            String reverseWords = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWords = reverseWords + word.charAt(j);
            }
            reverseString2 = reverseString2 + reverseWords + " ";
        }
        System.err.println(reverseString2);
    }
}
