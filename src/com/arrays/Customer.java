package com.arrays;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name,double creditLimit,String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getcreditLimit(){
        return creditLimit;
    }

    public void setcreditLimit(double creditName){
        this.creditLimit=creditName;

    }

    public String getEmail(){

        return email;
    }

    public void setEmail(String email){

        this.email=email;
    }

}


