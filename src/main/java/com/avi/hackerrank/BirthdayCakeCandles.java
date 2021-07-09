package com.avi.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BirthdayCakeCandles {

    Predicate<Integer> p = i -> i==8;

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(4,4,1,3);
        System.out.println(birthdayCakeCandles(l));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        long max = candles.stream().mapToLong(Integer::longValue).max().getAsLong();
        return (int)candles.stream().filter(i -> i==max).count();
        //List<Integer> l = m.values().stream().map(i -> i.intValue()).collect(Collectors.toList());
        //return l.get(l.size() -1);

    }
}
