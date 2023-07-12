package com.arrays;

public class CustomerMainClass {

    public static void main(String[] args){

        Customer c=new Customer("A",100.0, "a@gmail.com");

        System.out.println(c.getName());
        c.setName("JAVA");
        System.out.println(c.getName());
    }
}
