package com.sets;
import java.util.*;
public class TreeSetPL {
    public static void main(String [] arg){

        Set<Integer> s=new TreeSet();

        s.add(1);
        s.add(23);
        s.add(65);
        s.add(8);

        System.out.println(s);

        s.add(98);

        System.out.println(s);

        s.add(5);
        System.out.println(s);

        Iterator i= s.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        i=s.iterator();
        while(i.hasNext()){
            if(i.next().equals(65)){
                i.remove();
            }
        }

        System.out.println(s);
    }
}
