package com.avi.hackerrank;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class TimeConversion {
    public static void main(String[] args) {
        String s = "12:01:00PM";
        int hrs = Integer.parseInt(s.substring(0,2));
        //System.out.println(hrs);
        if(s.contains("PM") && hrs >0 && hrs <12){
            s = s.replace(s.substring(0,2), String.valueOf(hrs +12));
        }else if (s.contains("AM") && hrs == 12){
            s = s.replace(s.substring(0,2), "00");
        }
        System.out.println(s.substring(0,9));

        /*//timeConversion(time);
        LocalTime lt = null;
        if(s.contains("AM") && Integer.parseInt(s.split(":")[0]) == 12 ){
            s= s.replace(s.split(":")[0], "00");
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ssa");

        lt = LocalTime.parse(s, dtf);
        if(s.contains("PM")){

            if(Integer.parseInt(s.split(":")[0]) >0 && Integer.parseInt(s.split(":")[0]) <12 )
                lt = LocalTime.parse(s, dtf).plusHours(12);
        }

        System.out.println(LocalTime.of(lt.getHour(), lt.getMinute(), lt.getSecond()).format(DateTimeFormatter.ofPattern("HH:mm:ss")));*/
        //dtf.format(s);
    }
   /* public static String timeConversion(String s) {
        Stream.of(s).map( s1 -> {
            if(s1.contains("PM")){

            }
        })

    }*/
}
