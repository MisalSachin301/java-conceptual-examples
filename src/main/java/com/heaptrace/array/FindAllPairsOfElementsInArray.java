package com.heaptrace.array;

public class FindAllPairsOfElementsInArray {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 11, 9, 13, 8, 12};

        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if(array[i] + array[j] == 20)
                    System.out.println("("+array[i]+","+array[j]+")");
            }
        }
    }
}
