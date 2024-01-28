package com.heaptrace.string;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String str = "java concept of the day";

        String[] words = str.split(" ");
        String reverseString = "";

        for (int i=0; i<words.length; i++){
            String word = words[i];
            String reverseWord = "";

            for (int j=word.length()-1; j>=0; j--){
                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }

        System.out.println(reverseString);
    }
}
