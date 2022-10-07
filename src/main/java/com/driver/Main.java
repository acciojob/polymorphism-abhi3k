package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        int a = p.product(10,7);
        int b = p.product(2,3,4);
        double c = p.product(25.8,27.5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static class Product {
        public static int product(int x, int y) {
            return x+y;
        }
        public static int product(int x, int y, int z) {
            return x+y+z;
        }

        public static double product(double x, double y) {
            return x+y;
        }
    }

}


