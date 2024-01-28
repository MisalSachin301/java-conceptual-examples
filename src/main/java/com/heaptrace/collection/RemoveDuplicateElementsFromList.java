package com.heaptrace.collection;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromList {
    public static void main(String[] args) {
        //Constructing An ArrayList

        List<String> listWithDuplicateElements = new ArrayList<>();
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("J2EE");
        listWithDuplicateElements.add("JSP");
        listWithDuplicateElements.add("SERVLETS");
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("STRUTS");
        listWithDuplicateElements.add("JSP");

        Set<String> set = new HashSet<>(listWithDuplicateElements);
        System.out.println(listWithDuplicateElements);
        System.out.println(set);

        Set<String> linkedHashSet = new LinkedHashSet<>(listWithDuplicateElements);
        System.out.println(linkedHashSet);

        listWithDuplicateElements.stream().distinct().toList().forEach(System.out::println);

    }
}
