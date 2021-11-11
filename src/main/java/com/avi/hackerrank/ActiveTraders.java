package com.avi.hackerrank;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ActiveTraders {

    public static void main(String[] args) {
        Vector<String> a = new Vector<>();
        a.add("B");
        a.add("B");
        a.add("A");
        a.add("B");
        a.add("Z");

        mostActive(a).stream().forEach(System.out::println);
    }

    static List<String> mostActive(Vector<String> customers) {
        double totalTrades = customers.size();
        Map<String, Long > map = customers.stream().collect(groupingBy(i -> i , counting()));
        List<String> trs = new ArrayList<>();
        for(Map.Entry me : map.entrySet()){
            if(((long) me.getValue()/totalTrades)*100 >= 5) trs.add((String) me.getKey());
        }
        return trs.stream().sorted().collect(Collectors.toList());
    }
}
