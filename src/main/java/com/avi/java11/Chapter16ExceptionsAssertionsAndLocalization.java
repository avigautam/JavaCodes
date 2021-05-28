package com.avi.java11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Chapter16ExceptionsAssertionsAndLocalization extends Exception{
    public Chapter16ExceptionsAssertionsAndLocalization(){}
    public static void main(String[] args) {
        System.out.println("=========== Ques1 ===========");
        /*LocalDate date = LocalDate.parse("2020–04–30",
                DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date.getYear() + " "
                + date.getMonth() + " "+ date.getDayOfMonth());*/
        System.out.println("=========== Ques2 ===========");
       /* var f = DateTimeFormatter.ofPattern("hh mm ss 'o''clock'");
        System.out.println(f.format(ZonedDateTime.now()));*/
        System.out.println("=========== Ques3 ===========");

        LocalDateTime ldt = LocalDateTime.of(2020, 5, 10, 11, 22, 33);
        var f = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(ldt.format(f));
        System.out.println("=========== Ques4 ===========");
        //new Locale.
        System.out.println("=========== Ques5 ===========");
        System.out.println("=========== Ques6 ===========");
        System.out.println("=========== Ques7 ===========");
        System.out.println("=========== Ques8 ===========");
        System.out.println("=========== Ques9 ===========");
        System.out.println("=========== Ques10 ===========");
    }
}
