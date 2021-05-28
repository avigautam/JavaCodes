package com.avi.udemy;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class BirthdayCandles {
    /**
     * You are in charge of the cake for a child's birthday. You have decided the
     * cake will have one candle for each year of their total age.
     * They will only be able to blow out the tallest of the candles.
     * Count how many candles are tallest.
     *
     * Example
     * candles = [4,4,1,3]
     *
     * The maximum height candles are 4 units high. There are 2 of them, so return 2.
     */

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(4);
        li.add(4);
        li.add(4);
        li.add(3);
        System.out.println(birthdayCakeCandles(li));

    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        //Comparable<Integer> comp = i -> ;
       // candles.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println(candles.stream().mapToLong(i -> i.longValue()).max());
        System.out.println("==========");
        System.out.println(candles.stream().collect(groupingBy(i-> i, counting())));
        Map<Integer, Long> m = candles.stream().collect(groupingBy(i-> i, counting()));
        List<Integer> l = m.values().stream().map(i -> i.intValue()).collect(Collectors.toList());
        System.out.println(l.get(l.size() -1));
        return l.get(l.size() -1);
    }

}
