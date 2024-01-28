package com.heaptrace.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramStringTest {
    public static void main(String[] args) {
        //approach-1
        String str1 = " Sachin Dinkar Misall ";
        String str2 = " Sachin Dinkar Misall ";

        String copyOfStr1 = str1.replaceAll("\\s","").toLowerCase();
        String copyOfStr2 = str2.replaceAll("\\s","").toLowerCase();

//        boolean status = true;
//        if(copyOfStr1.length() == copyOfStr2.length()){
//            char[] s1Array = copyOfStr1.toCharArray();
//            char[] s2Array = copyOfStr2.toCharArray();
//
//            //Sorting both s1Array and s2Array
//            Arrays.sort(s1Array);
//            Arrays.sort(s2Array);
//
//            status = Arrays.equals(s1Array, s2Array);
//        }else {
//            status = false;
//        }
//
//        if (status)
//            System.out.println(str1+" and "+str2+"are anagrams");
//        else
//            System.out.println(str1+" and "+str2+"are not anagrams");

        //approach-2
        boolean flag = true;
        if(copyOfStr1.length() != copyOfStr2.length()){
            flag = false;
        }else {
            char[] charArray = copyOfStr1.toCharArray();

            StringBuffer stringBuffer = new StringBuffer(copyOfStr2);

            for (char ch : charArray){
                int index = stringBuffer.indexOf(String.valueOf(ch));
                if(index != -1){
                    stringBuffer.deleteCharAt(index);
                }else {
                    flag = false;
                    break;
                }
            }
        }

        if (flag){
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not anagrams");
        }

        Map<Character,Integer> map = new HashMap<>();

        boolean flag2 = true;

        if(copyOfStr1.length()==copyOfStr2.length()){
            for (int i =0 ; i<copyOfStr1.length();i++){
                char charAsKey = copyOfStr1.charAt(i);
                int charCountAsValue = 0;

                if(map.containsKey(charAsKey)){
                    charCountAsValue = map.get(charAsKey);
                }

                map.put(charAsKey, ++charCountAsValue);

                charAsKey = copyOfStr2.charAt(i);
                charCountAsValue = 0;

                if(map.containsKey(charAsKey)){
                    charCountAsValue = map.get(charAsKey);
                }

                map.put(charAsKey, --charCountAsValue);
            }
        }else {
            flag2 = false;
        }

        for (int value : map.values()){
            if (value != 0) {
                flag2 = false;
                break;
            }
        }

        if (flag2)
            System.out.println("Anagrams");
        else
            System.out.println("Not anagrams");
    }
}
