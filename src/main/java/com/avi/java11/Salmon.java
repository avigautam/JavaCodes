package com.avi.java11;

public class Salmon {
    int count;
    { System.out.print(count+"-"); }
    { count++; }
    public Salmon() {
        count = 4;
        System.out.print(2+"-");
    }
    public static void main(String[] args) {
        //boolean flag = 0;
        float x = 13;
        System.out.print(7+"-");
        var s = new Salmon();
        System.out.print(s.count+"-");

        System.out.println(11111);
    }
}
