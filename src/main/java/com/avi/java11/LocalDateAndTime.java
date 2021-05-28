package com.avi.java11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        var f = DateTimeFormatter.ofPattern("M dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f));  // October 20, 2020 at 11:12

        var dt1 = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);

        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy ");
        var f2 = DateTimeFormatter.ofPattern(" hh:mm");
        System.out.println(dt1.format(f1) + "at" + dt1.format(f2));

        var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
        System.out.println(dt1.format(g1)); // October 20, Party's at 06:15

    }
}
