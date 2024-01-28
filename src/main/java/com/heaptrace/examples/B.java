package com.heaptrace.examples;

public class B extends A{
    public B(){
        super();
        System.err.println("B():0-param constructor");
    }

    @Override
    void method() {
        System.err.println("method():B");
        super.method();
        System.err.println(super.a);
    }
}
