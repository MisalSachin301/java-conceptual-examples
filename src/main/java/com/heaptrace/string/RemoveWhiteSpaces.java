package com.heaptrace.string;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        //approach-1
        String str = " Sachin Dinkar Misal ";

        char[] charArray = str.toCharArray();
        StringBuilder withoutSpace = new StringBuilder();

        for (char c : charArray) {
            if (c != ' ' && c != '\t') {
                withoutSpace.append(c);
            }
        }

        System.out.println(withoutSpace);

       //approach-2
       String str2 = " Sachin Dinkar Misal ";

       char[] charArray2 = str2.toCharArray();
       String withoutSpace2 = "";

       for (char c : charArray2){
           if(c != ' ' && c != '\t')
               withoutSpace2 = withoutSpace2 + c;
       }

        System.out.println(withoutSpace2);

        //approach-3
        String str3 = " Sachin Dinkar Misal ";

        str3 = str3.replaceAll("\\s+","");

        System.out.println(str3);
    }
}
