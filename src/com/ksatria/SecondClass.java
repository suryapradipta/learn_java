package com.ksatria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SecondClass {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Banana")) {
                iterator.remove();
            }
            System.out.println(element);
        }



    }
}
