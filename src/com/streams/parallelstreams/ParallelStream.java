package com.streams.parallelstreams;

import java.sql.SQLOutput;
import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {

        long start=0;
        long end=0;

        long startp=0;
        long endp=0;

        start=System.currentTimeMillis();
        IntStream.range(1,100).forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("Stream took time: " + (end-start));                   //prints the list in order

        System.out.println("------------------------------------------------------------");
        startp=System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(System.out::println);
        endp=System.currentTimeMillis();
        System.out.println("Parallel Stream took time: " + (endp-startp));        //does not print the list in order
    }
}
