package com.heaptrace.clobj;

class ClassOne
{
    static int i = 10;

    static
    {
        i = 20;
    }

    public ClassOne(int i)
    {
        System.out.println(i);

        this.i = i;
    }

    {
        i = 30;
    }
}

class ClassTwo
{
    public static void main(String[] args)
    {
        System.out.println(ClassOne.i);
        ClassOne classOne = new ClassOne(1);
    }
}
