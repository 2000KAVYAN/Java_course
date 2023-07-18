package com.lambdaexpressions;
import java.util.*;

interface movieNew{
    int add(int i,int j);
}
public class Example2 {
    public static void main(String[] args) {


            movieNew obj = (i, j) -> (i + j);

            int result = obj.add(5, 7);
            System.out.println(result);


    }
}