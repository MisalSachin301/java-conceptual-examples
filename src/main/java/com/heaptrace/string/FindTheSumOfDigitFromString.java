package com.heaptrace.string;

public class FindTheSumOfDigitFromString {
    public static void main(String[] args) {
        String str = "abc123ab45";
        int sum = 0;
        char[] charArray = str.toCharArray();
        for(char ch : charArray){
            if(!Character.isDigit(ch)){
                System.out.println(ch);
                sum = sum + Character.getNumericValue(ch);
            }
        }
        System.out.println(sum);

        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                System.out.println(ch);
                sum += ch - '0';
            }
        }
        System.out.println(sum);


    }
}
