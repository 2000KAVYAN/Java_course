package com.streams;
import java.util.List;
import java.util.Arrays;
import java.util.stream.*;
public class Filtering {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(4,5,6,3,2,1);

//        Stream<Integer> s1= num.stream();
//        Stream<Integer> s2=s1.filter(n-> n%2==0);
//        Stream<Integer> s3= s2.map(n-> n*2);
//        int result = s3.reduce(0,(c,e)-> c+e);

        int result=num.stream()
                        .filter(n-> (n%2)==0)
                                .map(n->n*2)
                .reduce(0,(c,e)-> c+e);

        System.out.println(result);
    }
}
