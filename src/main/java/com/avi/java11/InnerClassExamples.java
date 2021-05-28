package com.avi.java11;

public class InnerClassExamples {
    class Inner{
        final static int age = 10;
        //final static int life;
    }
    static int age = 20;

    public static void main(String[] args) {
        class MethodInner{

        }

        var a = new InnerClassExamples();
        //InnerClassExamples.Inner i = new Inner();
        System.out.println(a.age);
        System.out.println(Inner.age);
    }
}
