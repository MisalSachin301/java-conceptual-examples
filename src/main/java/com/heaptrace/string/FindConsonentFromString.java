package com.heaptrace.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindConsonentFromString {
    public static void main(String[] args) {
        String str = "Sachin";
        List<Character> listOfVowel = Arrays.asList('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        List<Character> characters = Collections.unmodifiableList(listOfVowel);//
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (!listOfVowel.contains(c)) {
                System.out.print(c+" ");
            }
        }
        System.out.println();

        Pattern pattern = Pattern.compile("[^aeiouAEIOU]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();

        str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !listOfVowel.contains(c))
                .forEach(c -> System.out.print(c + " "));


    }
}

