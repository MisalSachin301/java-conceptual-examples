package com.heaptrace.clobj;

public class MyClass {
    private String name;
    private int age;

    // Constructor 1
    public MyClass(String name) {
        System.out.println("Constructor 1 called with name: " + name);
    }

    // Constructor 2
    public MyClass(String name, int age) {
        // Call Constructor 1 using "this" keyword
        this(name);
        this.age = age;
        System.out.println("Constructor 2 called with name: " + name + " and age: " + age);
    }

    public static void main(String[] args) {
        // Create an instance using Constructor 2
        MyClass myObject = new MyClass("John", 56);
    }
}

