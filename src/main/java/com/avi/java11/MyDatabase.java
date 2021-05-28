package com.avi.java11;

class Problem extends Exception {
    public Problem() {}
    {
        System.out.println("Problem");
    }
}
class YesProblem extends Problem {
    {
        System.out.println("YesProblem");
    }
}
public class MyDatabase {
    {
        System.out.println("MyDatabase");
    }
    public static void connectToDatabase() throws Problem {
        System.out.println("connectToDatabase");
            throw new YesProblem();
    }
    public static void main(String[] c)  {
        try {
            connectToDatabase();
        } catch (Problem problem) {
            System.out.println("Problem cached");
        }
    }
}

