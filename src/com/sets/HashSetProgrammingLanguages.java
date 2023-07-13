package com.sets;
import java.util.HashSet;
import java.util.*;
public class HashSetProgrammingLanguages {

    public static void main(String [] arg){

        Set<String> s=new HashSet();

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
            if(i.next().equals("java")){
                i.remove();
            }
        }

        System.out.println(s);
    }
}
