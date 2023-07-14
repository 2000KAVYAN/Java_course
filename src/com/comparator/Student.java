package com.comparator;
import java.util.*;
public class Student {

    String name;
    int age;
    double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student[" +
                "name='" + name +
                ", age=" + age +
                ", marks=" + marks +
                ']';
    }
}

class ByMarks implements Comparator<Student>{

    public int compare(Student s1,Student s2){

        return (int)(s2.marks-s1.marks);
//        return s1.getName().compareTo(s2.getName());
    }

}