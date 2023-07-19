package com.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

// Vehicle class using maps to convert words from lowerCase to UpperCase
 public class VehiclesEx1 {

    public static void main(String[] args) {

        List<String> Vehicle= Arrays.asList("bus","car","metro","train","jeep");
        List<String> VehicleInUpperCase= new ArrayList<>();

        System.out.println("Using streams and forEach: ");
        Vehicle.stream().map(Vword->Vword.toUpperCase()).forEach(Vword-> System.out.println(Vword));

        VehicleInUpperCase= Vehicle.stream().map(Vword->Vword.toUpperCase()).collect(Collectors.toList());
        System.out.println("Using streams and collect method:" +VehicleInUpperCase);
    }
}
