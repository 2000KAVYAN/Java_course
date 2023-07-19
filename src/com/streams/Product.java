package com.streams;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.stream.Stream;
import java.util.List;
import java.util.Set;

// using sets

// filter Method Example
 public class Product implements Comparable<Product>{

    String name;
    int ID;
    double price;

    public Product(String name, int ID, double price) {
        this.name = name;
        this.ID = ID;
        this.price = price;
    }

    public int compareTo(Product o){
        return (int)(this.price-o.price);
    }
}

class ProductMainClass{

    public static void main(String[] args) {

        Set<Product> productList= new TreeSet<>();

        productList.add(new Product("Samsung",34526,40000.0));
        productList.add(new Product("HP",67833,60000.50));
        productList.add(new Product("Dell",54462,55500.0));
        productList.add(new Product("Lenova",98763,65330.9));
        productList.add(new Product("Apple",27786,90046.0));

         productList.stream().filter(p->p.price>60000.0)
        .forEach(p-> System.out.println(p.price));

    }
}
