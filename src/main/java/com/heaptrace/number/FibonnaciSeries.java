package com.heaptrace.number;

public class FibonnaciSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a+" "+b);

        for (int i = 1 ; i < 10; i++){
            int sum = a + b;
            System.out.print(" "+sum);
            a = b;
            b = sum;
        }
    }
}
