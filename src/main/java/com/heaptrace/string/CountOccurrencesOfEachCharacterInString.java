package com.heaptrace.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccurrencesOfEachCharacterInString {
    public static void main(String[] args) {
        String str = "Sachin Dinkar Misal";

        Map<Character,Integer> map = new HashMap<>();

        char[] ch = str.toCharArray();
        for (Character character : ch){
            if(map.containsKey(character)){
                map.put(character, map.get(character) + 1);
            }else {
                map.put(character, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet){
            if(entry.getKey() > 1 && entry.getKey() != ' ')
                System.out.println(entry.getKey() +"="+ entry.getValue());
        }
    }
}
