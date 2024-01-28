package com.heaptrace.string;

public class StringInternExample {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = "Hello";

        // Calling intern() on a String object
        String s3 = s2.intern();

        // Comparing references to demonstrate intern() behavior
        System.out.println(s1 == s2);  // false
        System.out.println(s2 == s3);  // true
        System.out.println(s1 == s3); //false
    }
}
