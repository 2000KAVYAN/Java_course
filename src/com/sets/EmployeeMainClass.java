package com.sets;
import java.util.*;
public class EmployeeMainClass {

    public static void main(String[] args){
    Set<Employee> employee = new HashSet<>();

    employee.add(new Employee("K",25,30000.0));
    employee.add(new Employee("N",21,20000.50));


    Iterator<Employee> i= employee.iterator();

    while(i.hasNext()){
        System.out.println(i.next());
    }
        System.out.println();

    i= employee.iterator();
    while(i.hasNext()){
        System.out.println(i.next().getName());
    }

        i= employee.iterator();
        while(i.hasNext()){
            System.out.println(i);
            break;
        }


//        using for each
        for(Employee e: employee){
            System.out.println(e);
//            System.out.println(e.getName());
        }

}
}