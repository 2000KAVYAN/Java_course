package com.comparableTypes;
import java.util.*;
public class EmployeeMainClass {

    public static void main(String[] args) {

        Set<Employee> employee= new TreeSet<>();

        employee.add(new Employee("D",23,50000.0));
        employee.add(new Employee("C",32,40000.0));
        employee.add(new Employee("A",65,78040.0));
        employee.add(new Employee("B",22,50234.0));
        employee.add(new Employee("E",35,53450.0));

        Iterator i= employee.iterator();

        System.out.println("comparing based on the name");
        while(i.hasNext()) {

            System.out.println(i.next());
        }

    }
}
