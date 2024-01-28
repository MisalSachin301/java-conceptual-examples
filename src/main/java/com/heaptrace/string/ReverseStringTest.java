package com.heaptrace.string;

public class ReverseStringTest {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("java");
        System.out.println(buffer.reverse());

        String str = "java";

        char[] charArray = str.toCharArray();

        for (int i=str.length()-1; i>=0; i--){
            System.out.print(charArray[i]);
        }
    }
}
