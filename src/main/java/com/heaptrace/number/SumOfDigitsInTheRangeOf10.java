package com.heaptrace.number;

import java.util.Scanner;

public class SumOfDigitsInTheRangeOf10 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++){
            if(i%10 == 0){
                sum = sum + i;
            }
        }
        System.out.println("sum: "+sum);
    }
}
