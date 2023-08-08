package com.streams.parallelstreams;

import java.util.Arrays;
import java.util.List;

public class Student {
    String name;
    int score;


    Student(String name,int score){
        this.name=name;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}


class ParallelStreamsDemo{

    public static void main(String[] args) {

        List<Student> studentList= Arrays.asList(
                new Student("David",82),
                new Student("Eric",80),
                new Student("Angel",90),
                new Student("Smith",85),
                new Student("Bob",80),
                new Student("Nayan",89),
                new Student("Sam",77),
                new Student("Brent",86)
        );

        studentList.stream().filter(s-> s.getScore() >=85)
                .limit(3)
                .forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));

        System.out.println("-------------------------------------------------------------------");

        studentList.stream().parallel().filter(s-> s.getScore() >=85)
                .limit(3)
                .forEach(stu-> System.out.println(stu.getName()+" "+stu.getScore()));

    }


}
