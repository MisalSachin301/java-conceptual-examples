package com.heaptrace.string;

public class FindTheCharactersFromString {
    public static void main(String[] args) {
        String str = "abc123de45fg";

        char[] charArray = str.toCharArray();
        for(Character ch : charArray){
            if(!Character.isDigit(ch)){
                System.out.print(ch+" ");
            }
        }
    }
}
