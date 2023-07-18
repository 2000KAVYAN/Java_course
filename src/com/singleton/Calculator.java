package com.singleton;

public class Calculator {

    private Calculator(){

    }

    void add(int n1,int n2){
        System.out.println(n1+n2);
    }

    void sub(int n1,int n2){
        System.out.println(n1-n2);
    }

    static Calculator getCalculatorInstance(){
        Calculator c= new Calculator();
        return c;
    }
}

class CalculatorMainClass{

    public static void main(String[] args) {
         Calculator c1= Calculator.getCalculatorInstance();
         c1.add(5,3);
         c1.sub(5,3);
        System.out.println(c1);

        Calculator c2= Calculator.getCalculatorInstance();
        c1.add(7,3);
        c1.sub(7,3);
        System.out.println(c2);
    }

}
