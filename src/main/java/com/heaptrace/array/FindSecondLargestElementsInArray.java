package com.heaptrace.array;

public class FindSecondLargestElementsInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int largest = array[0];
        int secondLargest = array[1];

        for (int i=0; i<array.length;i++){
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        System.out.println(secondLargest);
    }
}
