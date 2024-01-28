package com.heaptrace.number;

import java.util.Scanner;

public class PallindromeNumberTest {
    public static void main(String[] args) {
        int rev = 0;
        Scanner scanner = new Scanner(System.in);
        System.err.println("Please enter a positive number");
        int num = scanner.nextInt();
        int temp = num;

        while(num>0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num /10;
        }
        System.err.println(rev+" "+temp);
        if(temp == rev)
            System.err.println("Pallindrome number");
        else
            System.err.println("Not a pallindrom number");
    }
}
