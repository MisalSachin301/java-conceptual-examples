package com.heaptrace.array;

import java.util.LinkedHashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};

        Set<String> set = new LinkedHashSet<>();
        for (int i=0; i<s1.length; i++){
            for (int j=0; j< s2.length; j++){
                if(s1[i].equals(s2[j])){
                    set.add(s1[i]);
                }
            }
        }

        System.out.println(set);

        Integer[] num1 = {1,2,3,4,5};
        Integer[] num2 = {3,4,5,6,7};

        Set<Integer> set2 = new LinkedHashSet<>();
        for (int i=0; i<num1.length; i++){
            for (int j=0; j< num2.length; j++){
                if(num1[i].equals(num2[j])){
                    set2.add(num1[i]);
                }
            }
        }

        System.out.println(set2);
    }
}
