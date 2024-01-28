package com.heaptrace.examples;

public class ClassA {
    static void staticMethod()
    {
        System.out.println("Static Method");
    }

    int methodOfA()
    {
        return (true ? null : 0);
    }
}
