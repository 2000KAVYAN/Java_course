package com.queues;
import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueue1 {

        public static void main(String[] args){
            Queue<String> q1=new PriorityQueue<>();

            q1.add("JAVA");
            q1.add("J2EE");
            q1.add("SpringBoot");
            q1.add("C++");

            System.out.println("size="+q1.size());

//            Object o=q1.poll();
//
//            while(o!= null){
//                System.out.println(o);
//                o=q1.poll();
//            }

//            while(q1.poll()!=null){
//                System.out.println(q1.poll());
//            }

//            while(q1.poll()!=null){
//                System.out.println(q1.peek());
//            }

//            System.out.println(q1.poll());

            q1.remove();
            System.out.println(q1);
            System.out.println(q1.element());
        }

}

