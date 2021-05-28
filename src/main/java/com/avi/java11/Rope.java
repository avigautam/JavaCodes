package com.avi.java11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rope extends Parent{
    //private static final String rightRope;

    private final void makeSense(){}

    public static void swing() {
        System.out.print("swing");
    }
    // Same private method is in Parent class
    // But this is not overriding
    private final void print(){
        System.out.println("Parent print");
    }
    public int getHeight() { return 8; }
    {
        System.out.println("Instance block");
    }

    protected static Integer chew() throws Exception {
           System.out.println("Rodent is chewing");
           return 1;
    }


    public int fly(int height) {
        System.out.println("Bird is flying at "+height+" meters");
        return height;
    }
    //public List<String> hairy(int p) { return null; }
    //public Object hairy(int p) { return null; }
    @Override
    public ArrayList<String> hairy(ArrayList<String> p) throws RuntimeException,ArrayIndexOutOfBoundsException { return null; }

    public static void climb() {
        System.out.println("climb");
    }
    public static void play() {
        swing();
        climb();
    }
    public static void main(String[] args) {
        double d = 12f;
        //var a ="s", b=1;
        //double a@a = 9;
        short i = 0;
        long l= 1;
        Rope rope = new Rope();
        CharSequence ch = new String("Hi"); // Here is String is subtype of CharSequence
        rope.play();
        Rope rope2 = null;
        System.out.print("-");
        rope2.play();
        new Rope().printInfo();
    }
    static {
        System.out.println("Static block");
    }
}
