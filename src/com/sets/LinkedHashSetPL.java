package com.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPL {

    public static void main(String [] arg){

        Set<String> s= new LinkedHashSet<>();

        s.add("JAVA");
        s.add("C++");
        s.add("Python");
        s.add("C#");

        System.out.println(s);

        s.add("java");

        System.out.println(s);

        s.add("JAVA");
        System.out.println(s);

        Iterator i= s.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        i=s.iterator();
        while(i.hasNext()){
            if(i.next().equals("Python")){
                i.remove();
            }
        }

        System.out.println(s);
    }
}
