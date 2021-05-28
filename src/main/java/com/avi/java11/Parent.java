package com.avi.java11;

import java.util.ArrayList;
import java.util.List;

public class Parent {
    static int age = 20;

    public Parent(){
        //super((Integer)null);
    }
    private final void print(){
        System.out.println("Parent print");
    }

    public int getHeight() { return 3; }
    public void printInfo() {
        System.out.println(getHeight());
    }
    public void fly() {
        System.out.println("Bird is flying");
    }

    public static Object p(){
        return "Parent";
    }

    protected List<String> hairy(ArrayList<String> p) { return null; }
}
