package com.avi.java11;

public interface BigCat {
    abstract String getName();
    //static int hunt() { getName(); return 5; }
    static int hunt() { return 5; }
    //default void climb() { rest(); }
    //void roar() { getName();  climb(); hunt(); }
    //private static boolean sneak() { roar(); return true; }
    //private static boolean sneak() { return true; }
    //private int rest() { return 2; };
}
