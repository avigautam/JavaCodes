package com.avi.java11;

public class EnterPark extends Exception {
    public EnterPark(String message) {
        super();
    }
    public static void main(String[] args) {
        checkInput(args);
        System.out.println(args[0] + args[1] + args[2]);
    }
    private static void checkInput(String[] v) {
        if (v.length <= 3)
            assert(false) : "Invalid input";
    }

}
