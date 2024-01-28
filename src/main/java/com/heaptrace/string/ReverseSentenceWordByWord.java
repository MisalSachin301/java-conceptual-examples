package com.heaptrace.string;

public class ReverseSentenceWordByWord {
    public static void main(String[] args) {
        String str1 = "java concept of the day";

        String[] words = str1.split(" ");
        String outputString = "";
        for (int i =words.length-1; i>=0; i--){;
            outputString = outputString + words[i] + " ";
        }
        System.out.println(outputString);
    }
}
