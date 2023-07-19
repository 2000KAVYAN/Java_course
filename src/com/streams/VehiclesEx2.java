package com.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

// using maps method to find the length of the word
public class VehiclesEx2 {
    public static void main(String[] args) {

        List<String> VehicleNew= Arrays.asList("bus","car","metro","train","jeep");
//        List<String> LengthOfString= new ArrayList<>();

        VehicleNew.stream().map(VehL -> VehL.length()).forEach(VehL -> System.out.println(VehL));

    }


}
