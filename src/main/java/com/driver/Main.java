package com.driver;

public class Main {


    public static void main(String[] args) {
        Product p = new Product();

        p.product(5,5);
        p.product(5,5,5);
        p.product(1.0,1.0);
    }

}
class Product{

    Product(){

    }

    public int product(int x, int y) {
        return x;
    }

    public int product(int x, int y, int z) {
        return x;
    }

    public double product(double x, double y) {
        return x;
    }

}