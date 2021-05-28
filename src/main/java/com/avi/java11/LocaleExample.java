package com.avi.java11;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleExample {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        //The first is to use the built‐in constants in the Locale class
        System.out.println(Locale.GERMAN);  // de
        System.out.println(Locale.GERMANY); // de_DE

        //Second way -> Constructor
        System.out.println(new Locale("fr"));       // fr
        System.out.println(new Locale("hi", "IN")); // hi_IN

        //Third way -builder design pattern
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();


        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));

        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));

        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));
    }
}
