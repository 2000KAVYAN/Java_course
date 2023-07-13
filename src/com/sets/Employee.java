package com.sets;
import java.util.*;
public class Employee {

    String name;
    int age;
    double salary;


    Employee( String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public  String toString(){
        return "Employee[name="+name+",age="+age+",salary="+salary+"]";
    }

}
