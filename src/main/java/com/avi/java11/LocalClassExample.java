package com.avi.java11;

public class LocalClassExample {

    private int length = 5;
    enum Food {APPLES, BERRIES, GRASS}
    public void calculate() {
        final int width = 20;
        class MyLocalClass {
            public void multiply() {
                System.out.print(length * width);
            }
        }
        MyLocalClass local = new MyLocalClass();
        local.multiply();
    }

    public static void printName(String name){
        name += " Gautam";
        System.out.println(name);
    }
    public static void main(String[] args) {
        final var name= "Avinash";
        printName(name);
        LocalClassExample outer = new LocalClassExample();
        outer.calculate();
    }

    interface inter{
        // Public can be used with default
        public default void p(){

        }
    }
}
