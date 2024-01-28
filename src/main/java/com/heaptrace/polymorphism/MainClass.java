package com.heaptrace.polymorphism;

public class MainClass
{
//    static void overloadedMethod(A a)
//    {
//        System.out.println("ONE");
//    }
//
//    static void overloadedMethod(B b)
//    {
//        System.out.println("TWO");
//    }
//
//    static void overloadedMethod(Object obj)
//    {
//        System.out.println("THREE");
//    }
//
//    public static void main(String[] args)
//    {
//        C c = new C();
//
//        overloadedMethod(c);
//    }


    double overloadedMethod(double d)
    {
        return d *= d;
    }

    int overloadedMethod(int i)
    {
        return overloadedMethod(i *= i);
    }

    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }

    public static void main(String[] args)
    {
        MainClass main = new MainClass();

        System.out.println(main.overloadedMethod(100));
    }
}
