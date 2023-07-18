package com.lambdaexpressions;
import java.util.*;

interface movie{
    void show(int i);
}
public class Example1 {
    public static void main(String[] args) {
        movie obj = (i) ->
        {
            System.out.println("Hai, I'm in the movie "+i);
        };
        obj.show(7);

    }
}
