package com.heaptrace.array;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,3,4,4,5};

        //approach-1
        for(int i=0; i<array.length; i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] == array[j])
                    System.out.println(array[i]);
            }
        }

        //approach-2
        Set<Integer> set = new HashSet<>();

//        Arrays.stream(array).filter(i -> !set.add(i)).boxed().collect(Collectors.toSet()).forEach(System.out::println);

//        for (Integer element : array){
//            if(!set.add(element))
//                System.out.println(element);
//        }

        Map<Integer,Integer> map = new HashMap<>();

        for (Integer element : array){
            if(map.get(element) == null)
                map.put(element, 1);
            else
                map.put(element, map.get(element) + 1);
        }

        System.out.println(map);
    }
}
