package com.heaptrace.array;

import java.util.Arrays;

public class CheckArrayEquality {
    public static void main(String[] args) {
        //approach-1
        int[] arrayOne = {2, 5, 1, 7, 4, 5};
        int[] arrayTwo = {2, 5, 1, 7, 4, 5};

        boolean equalOrNot = false;
        if(arrayOne.length == arrayTwo.length){
            for (int i=0; i<arrayOne.length;i++){
                if(arrayOne[i] == arrayTwo[i]){
                    equalOrNot = true;
                }else {
                    equalOrNot = false;
                }
            }
        }

        if (equalOrNot)
            System.out.println("Arrays are equal");
        else
            System.out.println("Arrays are not equal");

        //approach-2
        String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
        String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};

        Arrays.sort(s1);
        Arrays.sort(s2);
        System.out.println(Arrays.equals(s1, s2));

        //approach-3
        String[][] s3 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
        String[][] s4 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };

        System.out.println(Arrays.deepEquals(s3, s4));     //Output : true
    }
}
