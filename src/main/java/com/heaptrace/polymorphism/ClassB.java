package com.heaptrace.polymorphism;

public class ClassB extends ClassA{
    @Override
    void method() throws Exception {
        System.err.println();
    }

    @Override
    void method2() throws RuntimeException{
    }
}
