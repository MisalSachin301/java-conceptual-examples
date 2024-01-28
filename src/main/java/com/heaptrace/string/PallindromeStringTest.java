package com.heaptrace.string;

public class PallindromeStringTest {
    public static void main(String[] args) {
        String str ="rotator";
        String reverseString = "";
        char[] charArray = str.toCharArray();
        for(int i = str.length()-1; i >= 0; i--){
            reverseString = reverseString + str.charAt(i);
        }
        System.err.println(reverseString);
        if(str.equals(reverseString))
            System.err.println("Pallindrome string");
        else
            System.err.println("Not a pallindrome string");
    }
}

