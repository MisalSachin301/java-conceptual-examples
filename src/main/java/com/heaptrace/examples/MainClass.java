package com.heaptrace.examples;

public class MainClass {
    public static void main(String[] args) {
//        ClassA a = null;
//        a.staticMethod();
//
//        ClassA classA = new ClassA();
//        classA.methodOfA();

        Integer i1 = 127;

        Integer i2 = 127;

        System.out.println(i1 == i2);

        Integer i3 = 128;

        Integer i4 = 128;

        System.out.println(i3 == i4);
    }
}
