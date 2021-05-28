package com.avi.udemy;

public class Foo {
    static int c,b;

    public static void main(String[] args) {
        System.out.println(setVar(31,41));
        System.out.println(setInt(4));
        System.out.println(c);
        System.out.println(b);
    }

    private static int setVar(int a, int b){
        c=  b= a;
        System.out.println(b);
        return c;
    }

    private static int setInt(int c){
        return c=c;
    }
}
