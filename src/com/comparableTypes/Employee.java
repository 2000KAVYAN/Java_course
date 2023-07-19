package com.comparableTypes;
import java.util.*;
public class Employee implements Comparable<Employee>{

    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "name='" + name +
                ", age=" + age +
                ", salary=" + salary +
                "]";
    }

    @Override
    public int compareTo(Employee o) {
        return (int)(this.salary-o.salary);
//       return this.name.compareTo(o.name);
    }
}
