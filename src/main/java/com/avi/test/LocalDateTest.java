package com.avi.test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("ECT"));
        System.out.println(ldt);
        LocalDate l = LocalDate.of(2021, 8,25);
        System.out.println(l.plusDays(181));
    }
}
