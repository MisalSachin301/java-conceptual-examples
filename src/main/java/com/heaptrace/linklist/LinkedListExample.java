package com.heaptrace.linklist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        //Adding elements at the end of the list
        list.add("JAVA");
        list.add("J2EE");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("JDBC");

        //Printing the elements of list
        System.out.println(list);      //Output : [JAVA, J2EE, JSP, SERVLETS, JDBC]

        //Getting the Iterator object using descendingIterator() method
        Iterator<String> it = list.descendingIterator();

        //printing the elements of list in reverse order
        while (it.hasNext())
        {
            System.err.println(it.next());
        }

        System.out.println();

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext())
            System.err.println(iterator.next());
    }
}
