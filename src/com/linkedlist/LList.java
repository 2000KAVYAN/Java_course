package com.linkedlist;

import java.util.LinkedList;

public class LList {

    public static void main(String[] args){
        LinkedList<String> list1=new LinkedList<String>();

        list1.addFirst("a");
        list1.addFirst("is");
        list1.addLast("list");
        list1.addFirst("this");
        System.out.println(list1);

        list1.removeFirst();
        System.out.println(list1);
        System.out.println(list1.size());

        list1.removeLast();
        System.out.println(list1);
        System.out.println(list1.size());

        list1.addLast("list");
        list1.addFirst("this");
        System.out.println(list1.size());

        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i));
            System.out.print("-->");
        }
        System.out.print("-->"+"null");
    }
}
