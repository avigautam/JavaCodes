package com.avi.java11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClassInitializationAndInstantiationExample {
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Initialization Block");
    }
    private void print(){
        System.out.println("Print Method");
        try{
            throw new IOException();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    void rollOut() throws ClassCastException {}

    public void transform(String c) {
        try {
            rollOut();
        } catch (IllegalArgumentException | ClassCastException a) {
        }
    }

    public void dontFail() {
        try {
            System.out.println("work real hard");
        } catch (StackOverflowError e) {
        } catch (RuntimeException e) {}
    }

    /*public void tryAgain(String s) {
        try(FileReader r = null, p = new FileReader("")) {
            System.out.print("X");
            throw new IllegalArgumentException();
        } catch (Exception s) {
            System.out.print("A");
            throw new FileNotFoundException();
        } finally {
            System.out.print("O");
        }
    }*/

    public static void main(String[] args) {
        var ob1 = new ClassInitializationAndInstantiationExample();
        ob1.print();

        var ob2 = new ClassInitializationAndInstantiationExample();
        ob2.print();
    }
}
