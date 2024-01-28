package com.heaptrace.number;

public class SumOfAllDigit {
    public static void main(String[] args) {
        int number = 12345;
        int sum = 0;
        int rem = 0;

        while (number > 0){
            rem = number % 10;
            sum = sum + rem;
            number = number / 10;
        }

        System.out.println(sum);
    }
}
