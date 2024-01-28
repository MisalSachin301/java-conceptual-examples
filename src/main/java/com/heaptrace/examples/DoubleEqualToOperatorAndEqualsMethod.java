package com.heaptrace.examples;

public class DoubleEqualToOperatorAndEqualsMethod {
    public static void main(String[] args) {
        String str1 = "str1";
        String str2 = "str2";
        String str3 = "str1";

        if (str1 == str2)
            System.out.println(str1.hashCode()+" "+str2.hashCode());
        else
            System.out.println(str1.hashCode()+" "+str2.hashCode());

        int i = 1;
        int j = 2;

        if (i == j)
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        if(str1.equals(str2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");

        if (str1.equals(str3))
            System.out.println("Equal");

    }
}
