package com.driver;

public class Main {
    static class Product{

        public int product(int x, int y) {
            return 0;
        }

        public int product(int x, int y, int z) {
            return 0;
        }

        public double product(double x, double y) {
            return 1.0;
        }

    }

    public static void main(String[] args) {
        Product p = new Product();

        p.product(5,5);
        p.product(5,5,5);
        double product = p.product(1.0,1.0);
    }

}