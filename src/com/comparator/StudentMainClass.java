package com.comparator;
import java.util.*;
public class StudentMainClass {

    public static void main(String[] args) {

        ByMarks byMarks= new ByMarks();

        Set<Student> student= new TreeSet<>(byMarks);

        student.add(new Student("R",13,89.0));
        student.add(new Student("S",14,50.0));
        student.add(new Student("U",15,70.0));
        student.add(new Student("Q",21,83.0));
        student.add(new Student("P",19,90.0));

        Iterator i= student.iterator();

        System.out.println("comparing based on marks");
        while(i.hasNext()){
            System.out.println(i.next());

        }

    }

}

