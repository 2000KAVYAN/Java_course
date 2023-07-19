package com.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class FilteringStrings {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Arya","Nayan","Trinayan","Aarna");

        List<String> nameList= new ArrayList<>();

        nameList=names.stream().filter(str->str.length()>4 && str.length()<8).collect(Collectors.toList());

        System.out.println(nameList);

        names.stream().filter(str->str.length()>4 && str.length()<8).forEach(str-> System.out.println(str));
    }

}
