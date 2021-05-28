package com.avi.java11;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Child extends Parent{
    int age = 10;
    public Child() {
        super();
    }

    public static String p(){
        return "Child";
    }

    public static void main(String[] args) {
        //Parent p = new Child();
        //System.out.println(p.p());

        LocalDate l1 = LocalDate.of(2019, 1, 1);
        LocalDate l2 = LocalDate.parse("2019-01-01", DateTimeFormatter.ISO_DATE);
        LocalDate l3 = LocalDate.now().withDayOfMonth(1).withMonth(1).withYear(2019);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l1.equals(l1) + " " + l2.equals(l3));
    }
}
