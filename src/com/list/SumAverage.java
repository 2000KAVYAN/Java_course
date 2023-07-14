package com.list;
import java.util.*;
public class SumAverage {

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();

        list.add(12);
        list.add(65);
        list.add(42);
        list.add(98);
        list.add(38);

        ListIterator l1= list.listIterator();

        int sum=0,average=0,count=0;

        for(Integer i: list){
            sum+=i;
            count++;
        }
        System.out.println(sum);

        average=sum/count;

        System.out.println(average);

        Collections.sort(list);

        System.out.println(list);

        l1= list.listIterator();

        while(l1.hasNext()) {
            System.out.println(l1.next());
        }

        System.out.println("reversing the list");
        while(l1.hasPrevious()) {
            System.out.println(l1.previous());
        }

    }

}
