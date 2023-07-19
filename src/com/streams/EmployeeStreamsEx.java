package com.streams;
import com.comparableTypes.Employee;

import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

// using employeeClass in filter and map methods
public class EmployeeStreamsEx {

    String name;
    int empID;

    double salary;

    public EmployeeStreamsEx(String name, int empID, double salary) {
        this.name = name;
        this.empID = empID;
        this.salary = salary;
    }
}

class EmployeeStreamsMainClass{

    public static void main(String[] args) {

        List<EmployeeStreamsEx> employee = Arrays.asList(
                new EmployeeStreamsEx("D", 23, 50000.0),
        new EmployeeStreamsEx("C", 32, 40000.0),
        new EmployeeStreamsEx("A", 65, 78040.0),
        new EmployeeStreamsEx("B", 22, 50234.0),
        new EmployeeStreamsEx("E", 35, 53450.0)
        );

//        Filtering based on salary using filter and map method(in map method tax has been paid. Therefore, salary-5000)
       List<Double> EmployeeSalaryList;
        EmployeeSalaryList=employee.stream()

                .filter(slr-> slr.salary>50500.0)   // filtering
                .map(slr -> slr.salary-5000 )            // mapping
                        .collect(Collectors.toList());

        System.out.println(EmployeeSalaryList);
    }
}
